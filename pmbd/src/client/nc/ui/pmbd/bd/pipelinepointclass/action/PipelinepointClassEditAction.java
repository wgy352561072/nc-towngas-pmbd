package nc.ui.pmbd.bd.pipelinepointclass.action;

import java.awt.event.ActionEvent;

import nc.ui.pm.util.BillCardPanelUtil;
import nc.ui.pmpub.basedoc.treecard.action.EditAction;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.ui.uif2.editor.BillCardPanelForm;
import nc.ui.uif2.model.HierachicalDataAppModel;
import nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO;
import nc.vo.pmbd.bd.pipelinepointclass.util.PipelinepointClassRefrenceUtil;
import nc.vo.pub.SuperVO;
/**
 * �༭������
 * @author wangaa
 *
 */
public class PipelinepointClassEditAction extends EditAction {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doAction(ActionEvent e) throws Exception {
		super.doAction(e);
		initEnable();
	}

	private void initEnable(){
		SuperVO vo = (SuperVO) ((HierachicalDataAppModel) getModel()).getSelectedData();
		boolean isRef = PipelinepointClassRefrenceUtil.checkIsReference(vo);
		BillCardPanel billCardPanel = ((BillCardPanelForm)getEditor()).getBillCardPanel();
		if(isRef){
			BillCardPanelUtil.setHeadEnabled(billCardPanel, PipelinepointclassVO.CODE, false);
			ShowStatusBarMsgUtil.showStatusBarMsg("�ü������౻���ã�ֻ�����ơ���ע�ֶο����޸�", getModel().getContext());
		}else{
			BillCardPanelUtil.setHeadEnabled(billCardPanel, PipelinepointclassVO.CODE, true);
		}
	}

}