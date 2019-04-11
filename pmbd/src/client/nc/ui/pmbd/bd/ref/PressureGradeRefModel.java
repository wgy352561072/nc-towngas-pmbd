package nc.ui.pmbd.bd.ref;

import nc.ui.bd.ref.AbstractRefModel;

public class PressureGradeRefModel extends AbstractRefModel {
	
	public PressureGradeRefModel(){
		super();
	}
	
	@Override
	public String[] getFieldCode() {//参照数据的字段编码
		return new String[]{
				"code",
				"name"
		};
	}
	
	@Override
	public String[] getFieldName() {//参照数据的字段名称
		return new String[]{
				"压力等级编码",
				"压力等级名称"
		};
	}
	
	@Override
	public String[] getHiddenFieldCode() {//需要隐藏的参照数据的字段编码
		//lxiaofan
		//需要把涉及到但不用的字段放入，不仅是getFieldCode中的字段
		//例如此处还应该将getFatherField方法中的字段和getChildField方法中的字段放入
		return new String[]{"pk_pressuregrade"};
	}
	
	@Override
	public String getTableName() {//参照数据的表名
		return "pmbd_pressuregrade";
	}
	
	@Override
	public String getPkFieldCode() {//参照数据对应表的主键
		return "pk_pressuregrade";
	}
	
	@Override
	public String getRefCodeField() {//参照对应的编码字段
		return "code";
	}
	
	@Override
	public String getRefNameField() {//参照对应的名称字段
		return "name";
	}
	
	@Override
	public String getWherePart() {//参照数据的过滤条件
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
