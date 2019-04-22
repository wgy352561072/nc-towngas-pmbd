package nc.ui.pmbd.bd.ref;

import nc.bs.logging.Logger;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.md.model.MetaDataException;
import nc.ui.bd.ref.AbstractRefModel;
import nc.ui.bd.ref.IRefDocEdit;
import nc.ui.bd.ref.IRefMaintenanceHandler;
import nc.ui.pub.beans.ValueChangedEvent;
import nc.vo.pmbd.bd.pressuregrade.PressuregradeVO;
import nc.vo.pmbd.common.consts.FuncCodeConst;
import nc.vo.pub.BusinessException;
import nc.vo.util.VisibleUtil;

/**
 *
 * <p>
 * <b>������Ҫ������¹��ܣ�</b>
 *
 * <ul>
 * <li>ѹ���ȼ��Ĳ���
 * </ul>
 *
 * <p>
 * <p>
 *
 * @version 6.5
 * @since 6.5
 * @author wugy
 * @time 2019-04-22 
 */
public class PressureGradeRefModel extends AbstractRefModel {
	private String beanID = null;

	public PressureGradeRefModel(String refNodeName) {
		this.setRefNodeName(refNodeName);

		this.setRefMaintenanceHandler(new IRefMaintenanceHandler() {

			@Override
			public String[] getFucCodes() {
				return new String[] { FuncCodeConst.DATALIST_GROUP, FuncCodeConst.DATALIST_ORG };// ���ܺ�
			}

			@Override
			public IRefDocEdit getRefDocEdit() {
				// TODO wangaa �������
				return null;
			}
		});
	}

	@Override
	public int getDefaultFieldCount() {
		return 2;
	}

	@Override
	public String getRefTitle() {
		return "ѹ���ȼ�";
	}

	@Override
	public void setRefNodeName(String refNodeName) {
		// ҵ��������
		this.setTableName("pmbd_pressuregrade");
		// ��������
		this.m_strRefNodeName = refNodeName;

		// ����������
		this.setFieldCode(new String[] { "pmbd_pressuregrade.code", "pmbd_pressuregrade.name",
				"pmbd_pressuregrade.pk_pressuregrade" });

		// ������������
		this.setFieldName(new String[] {"ѹ���ȼ�����","ѹ���ȼ�����"});

		// ���������ֶ�
		this.setPkFieldCode("pmbd_pressuregrade.pk_pressuregrade");

		// ���ֶ����Ƹ�ֵ
		this.resetFieldName();
		// �Ƿ��Сд����
		this.setCaseSensive(Boolean.TRUE);

		setResourceID("4801025015");

		this.setFilterRefNodeName(new String[] {"��Ŀ��֯"});
		// ��ӡ����á�����
		this.setAddEnableStateWherePart(true);

		this.addWherePart(" and dr = 0");

	}

	// �ܿ�ģʽ����
	@Override
	protected String getEnvWherePart() {
		String wherePart = null;
		try {
			wherePart = VisibleUtil.getRefVisibleCondition(getPk_group(), getPk_org(), getBeanID());
		} catch (BusinessException e) {
			Logger.error(e.getMessage());
			wherePart = " 1=2 ";
			return wherePart;
		}
		return wherePart;
	}

	@Override
	public void filterValueChanged(ValueChangedEvent changedValue) {
		String[] pks = (String[]) changedValue.getNewValue();
		if (pks != null && pks.length > 0) {
			String pk_org = pks[0];
			this.setPk_org(pk_org);
		}
	}

	private String getBeanID() throws MetaDataException {
		if (beanID == null) {
			IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(PressuregradeVO.class.getName());
			beanID = bean.getID();
		}
		return beanID;
	}
}