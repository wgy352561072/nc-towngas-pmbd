package nc.ui.pmbd.bd.pipelinepointclass.action;

import java.awt.event.ActionEvent;

import nc.bs.pmpub.util.RefrenceUtil;
import nc.bs.uif2.IActionCode;
import nc.bs.uif2.validation.IValidationService;
import nc.ui.pmpub.basedoc.treecard.view.TreeCardBillForm;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.beans.UIDialog;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.ui.uif2.actions.ActionInitializer;
import nc.ui.uif2.editor.IEditor;
import nc.ui.uif2.model.HierachicalDataAppModel;
import nc.ui.uif2.model.IAppModelService;
import nc.vo.bd.pub.NODE_TYPE;
import nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO;
import nc.vo.pmpub.common.PMCommonKeyConst;
import nc.vo.pub.BusinessException;

/**
 * @author wugy
 */
public class PipelinepointClassDeleteAction extends
		nc.ui.pmpub.basedoc.treecard.action.DeleteAction {

	private static final long serialVersionUID = 1L;

	private IAppModelService service;
	private IEditor editor;

	// ע��ɾ��ǰУ��
	private IValidationService validationService = null;
	
	public PipelinepointClassDeleteAction() {
		super();
		ActionInitializer.initializeAction(this, IActionCode.DELETE);
	}	
	
	// ���� beforeStartDoActionֱ�ӷ���true�� ��У����ʾ��Ϣж��doAction��
	@Override
	public boolean beforeStartDoAction(ActionEvent actionEvent)
			throws Exception {
		return true;
	}	
	
	@Override
	public void doAction(ActionEvent e) throws Exception {
		PipelinepointclassVO obj = (PipelinepointclassVO) ((HierachicalDataAppModel) getModel())
				.getSelectedData();
		if (obj == null) {
			return;
		}

		String pk_org = (String) obj.getAttributeValue(PMCommonKeyConst.PK_ORG);
		NODE_TYPE nodetype = super.getModel().getContext().getNodeType();
		if (NODE_TYPE.ORG_NODE.equals(nodetype)) {
			String refPk = ((TreeCardBillForm) getEditor()).getOrgPanel()
					.getRefPane().getRefPK();
			if (!pk_org.equals(refPk)) {
				throw new BusinessException(nc.vo.ml.NCLangRes4VoTransl
						.getNCLangRes().getStrByID("pmpub_0", "04801000-0272")/*
																			 * @res
																			 * "�Ǳ���֯�µ����ݣ�����ɾ��"
																			 */);
			}
		}		

		//У��
		if (validationService != null) {
			getValidationService().validate(obj);
		}
		
		PipelinepointclassVO[] vos = new PipelinepointclassVO[1];
		vos[0] = obj;
		
		boolean isHasChild = RefrenceUtil.checkIsReference(
				"pmbd_pipelinepointclass", vos,
				new String[] { "pmbd_pipelinepointclass" });
		
		if(isHasChild){
			String message = "��ȷ��Ҫɾ����ѡ���ݼ�������ڵ���";
			if (UIDialog.ID_NO == MessageDialog.showYesNoDlg(getModel()
					.getContext().getEntranceUI(), null, message)) {
				return;
			} else {
				((HierachicalDataAppModel) getModel()).delete();
			}
		}else{
			String message = "��ȷ��Ҫɾ����ѡ������";
			if (UIDialog.ID_NO == MessageDialog.showYesNoDlg(getModel()
					.getContext().getEntranceUI(), null, message)) {
				return;
			} else {
				((HierachicalDataAppModel) getModel()).delete();
			}
		}
		
		showStatusBarMessage(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes()
				.getStrByID("common", "UCH006")/* @res "ɾ���ɹ�" */);
	}

	public IAppModelService getService() {
		return service;
	}

	public void setService(IAppModelService service) {
		this.service = service;
	}

	public IEditor getEditor() {
		return editor;
	}

	public void setEditor(IEditor editor) {
		this.editor = editor;
	}

	public IValidationService getValidationService() {
		return validationService;
	}

	public void setValidationService(IValidationService validationService) {
		this.validationService = validationService;
	}

	/** ״̬����ʾ��Ϣ */
	private void showStatusBarMessage(String msg) {
		ShowStatusBarMsgUtil.showStatusBarMsg(msg, model.getContext());
	}
	
}