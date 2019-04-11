package nc.ui.pmbd.bd.ref;

import nc.ui.bd.ref.AbstractRefTreeModel;

public class PipelinepointClassRefModel extends AbstractRefTreeModel {

	public PipelinepointClassRefModel() {
		super();
	}

	@Override
	public int getClassDefaultFieldCount() {
		return super.getClassDefaultFieldCount();
	}
	
	@Override
	public String[] getFieldCode() {//�������ݵ��ֶα���
		return new String[]{
				"code",
				"name"
		};
	}
	
	@Override
	public String[] getFieldName() {//�������ݵ��ֶ�����
		return new String[]{
				"���ߵ����",
				"���ߵ�����"
		};
	}
	
	@Override
	public String[] getHiddenFieldCode() {//��Ҫ���صĲ������ݵ��ֶα���
		//lxiaofan
		//��Ҫ���漰�������õ��ֶη��룬������getFieldCode�е��ֶ�
		//����˴���Ӧ�ý�getFatherField�����е��ֶκ�getChildField�����е��ֶη���
		return new String[]{"pk_pipelinepointclass", "pk_parent"};
	}
	
	@Override
	public String getTableName() {//�������ݵı���
		return "pmbd_pipelinepointclass";
	}
	
	@Override
	public String getPkFieldCode() {//�������ݶ�Ӧ�������
		return "pk_pipelinepointclass";
	}

	@Override
	public String getFatherField() {//���ṹ�ĸ������ֶ�
		return "pk_parent";
	}
	
	@Override
	public String getChildField() {//���ṹ���������ֶ�
		return "pk_pipelinepointclass";
	}
	
	@Override
	public String getRefCodeField() {//���ն�Ӧ�ı����ֶ�
		return "code";
	}
	
	@Override
	public String getRefNameField() {//���ն�Ӧ�������ֶ�
		return "name";
	}
	
	@Override
	public String getWherePart() {//�������ݵĹ�������
//		return super.getWherePart();
		String wherePart = super.getWherePart();
		if(null == wherePart || "".equals(wherePart.trim())){
			wherePart = " dr = 0 ";
		}else{
			wherePart += " and dr = 0 ";
		}
		return wherePart;
	}
}
