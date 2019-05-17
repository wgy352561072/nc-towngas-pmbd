package nc.vo.pmbd.bd.pipelinepointclass;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> �˴���Ҫ�������๦�� </b>
 * <p>
 *   �˴�����۵�������Ϣ
 * </p>
 *  ��������:2019-5-17
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class PipelinepointclassVO extends SuperVO {
	
/**
*����
*/
public java.lang.String pk_pipelinepointclass;
/**
*����
*/
public java.lang.String pk_group;
/**
*��֯
*/
public java.lang.String pk_org;
/**
*�������
*/
public java.lang.String code;
/**
*��������
*/
public java.lang.String name;
/**
*������
*/
public java.lang.String pk_parent;
/**
*����״̬
*/
public java.lang.Integer enablestate;
/**
*������
*/
public java.lang.String creator;
/**
*����ʱ��
*/
public UFDateTime creationtime;
/**
*�޸���
*/
public java.lang.String modifier;
/**
*�޸�ʱ��
*/
public UFDateTime modifiedtime;
/**
*��ע
*/
public java.lang.String memo;
/**
*����
*/
public java.lang.String innercode;
/**
*vdef1
*/
public java.lang.String vdef1;
/**
*vdef2
*/
public java.lang.String vdef2;
/**
*vdef3
*/
public java.lang.String vdef3;
/**
*vdef4
*/
public java.lang.String vdef4;
/**
*vdef5
*/
public java.lang.String vdef5;
/**
*vdef6
*/
public java.lang.String vdef6;
/**
*vdef7
*/
public java.lang.String vdef7;
/**
*vdef8
*/
public java.lang.String vdef8;
/**
*vdef9
*/
public java.lang.String vdef9;
/**
*vdef10
*/
public java.lang.String vdef10;
/**
*ʱ���
*/
public UFDateTime ts;
    

/**
*ʱ���
*/
public static final String TS="ts";;

public static final String PK_PIPELINEPOINTCLASS = "pk_pipelinepointclass";
public static final String PK_GROUP = "pk_group";
public static final String PK_ORG = "pk_org";
public static final String CODE = "code";
public static final String NAME = "name";
public static final String PK_PARENT = "pk_parent";
public static final String MEMO = "memo";
public static final String INNERCODE = "innercode";
public static final String ENABLESTATE = "enablestate";
public static final String CREATOR = "creator";
public static final String CREATIONTIME = "creationtime";
public static final String MODIFIER = "modifier";
public static final String MODIFIEDTIME = "modifiedtime";
public static final String DEF1 = "def1";
public static final String DEF2 = "def2";
public static final String DEF3 = "def3";
public static final String DEF4 = "def4";
public static final String DEF5 = "def5";
public static final String DEF6 = "def6";
public static final String DEF7 = "def7";
public static final String DEF8 = "def8";
public static final String DEF9 = "def9";
public static final String DEF10 = "def10";
    
/**
* ���� pk_pipelinepointclass��Getter����.������������
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getPk_pipelinepointclass() {
return this.pk_pipelinepointclass;
} 

/**
* ����pk_pipelinepointclass��Setter����.������������
* ��������:2019-5-17
* @param newPk_pipelinepointclass java.lang.String
*/
public void setPk_pipelinepointclass ( java.lang.String pk_pipelinepointclass) {
this.pk_pipelinepointclass=pk_pipelinepointclass;
} 
 
/**
* ���� pk_group��Getter����.������������
*  ��������:2019-5-17
* @return nc.vo.org.GroupVO
*/
public java.lang.String getPk_group() {
return this.pk_group;
} 

/**
* ����pk_group��Setter����.������������
* ��������:2019-5-17
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( java.lang.String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ���� pk_org��Getter����.����������֯
*  ��������:2019-5-17
* @return nc.vo.org.OrgVO
*/
public java.lang.String getPk_org() {
return this.pk_org;
} 

/**
* ����pk_org��Setter����.����������֯
* ��������:2019-5-17
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( java.lang.String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* ���� code��Getter����.���������������
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getCode() {
return this.code;
} 

/**
* ����code��Setter����.���������������
* ��������:2019-5-17
* @param newCode java.lang.String
*/
public void setCode ( java.lang.String code) {
this.code=code;
} 
 
/**
* ���� name��Getter����.����������������
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getName() {
return this.name;
} 

/**
* ����name��Setter����.����������������
* ��������:2019-5-17
* @param newName java.lang.String
*/
public void setName ( java.lang.String name) {
this.name=name;
} 
 
/**
* ���� pk_parent��Getter����.��������������
*  ��������:2019-5-17
* @return nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO
*/
public java.lang.String getPk_parent() {
return this.pk_parent;
} 

/**
* ����pk_parent��Setter����.��������������
* ��������:2019-5-17
* @param newPk_parent nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO
*/
public void setPk_parent ( java.lang.String pk_parent) {
this.pk_parent=pk_parent;
} 
 
/**
* ���� enablestate��Getter����.������������״̬
*  ��������:2019-5-17
* @return nc.vo.pm.constant.Enablestate
*/
public java.lang.Integer getEnablestate() {
return this.enablestate;
} 

/**
* ����enablestate��Setter����.������������״̬
* ��������:2019-5-17
* @param newEnablestate nc.vo.pm.constant.Enablestate
*/
public void setEnablestate ( java.lang.Integer enablestate) {
this.enablestate=enablestate;
} 
 
/**
* ���� creator��Getter����.��������������
*  ��������:2019-5-17
* @return nc.vo.sm.UserVO
*/
public java.lang.String getCreator() {
return this.creator;
} 

/**
* ����creator��Setter����.��������������
* ��������:2019-5-17
* @param newCreator nc.vo.sm.UserVO
*/
public void setCreator ( java.lang.String creator) {
this.creator=creator;
} 
 
/**
* ���� creationtime��Getter����.������������ʱ��
*  ��������:2019-5-17
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* ����creationtime��Setter����.������������ʱ��
* ��������:2019-5-17
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* ���� modifier��Getter����.���������޸���
*  ��������:2019-5-17
* @return nc.vo.sm.UserVO
*/
public java.lang.String getModifier() {
return this.modifier;
} 

/**
* ����modifier��Setter����.���������޸���
* ��������:2019-5-17
* @param newModifier nc.vo.sm.UserVO
*/
public void setModifier ( java.lang.String modifier) {
this.modifier=modifier;
} 
 
/**
* ���� modifiedtime��Getter����.���������޸�ʱ��
*  ��������:2019-5-17
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getModifiedtime() {
return this.modifiedtime;
} 

/**
* ����modifiedtime��Setter����.���������޸�ʱ��
* ��������:2019-5-17
* @param newModifiedtime nc.vo.pub.lang.UFDateTime
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.modifiedtime=modifiedtime;
} 
 
/**
* ���� memo��Getter����.����������ע
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getMemo() {
return this.memo;
} 

/**
* ����memo��Setter����.����������ע
* ��������:2019-5-17
* @param newMemo java.lang.String
*/
public void setMemo ( java.lang.String memo) {
this.memo=memo;
} 
 
/**
* ���� innercode��Getter����.������������
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getInnercode() {
return this.innercode;
} 

/**
* ����innercode��Setter����.������������
* ��������:2019-5-17
* @param newInnercode java.lang.String
*/
public void setInnercode ( java.lang.String innercode) {
this.innercode=innercode;
} 
 
/**
* ���� vdef1��Getter����.��������vdef1
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef1() {
return this.vdef1;
} 

/**
* ����vdef1��Setter����.��������vdef1
* ��������:2019-5-17
* @param newVdef1 java.lang.String
*/
public void setVdef1 ( java.lang.String vdef1) {
this.vdef1=vdef1;
} 
 
/**
* ���� vdef2��Getter����.��������vdef2
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef2() {
return this.vdef2;
} 

/**
* ����vdef2��Setter����.��������vdef2
* ��������:2019-5-17
* @param newVdef2 java.lang.String
*/
public void setVdef2 ( java.lang.String vdef2) {
this.vdef2=vdef2;
} 
 
/**
* ���� vdef3��Getter����.��������vdef3
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef3() {
return this.vdef3;
} 

/**
* ����vdef3��Setter����.��������vdef3
* ��������:2019-5-17
* @param newVdef3 java.lang.String
*/
public void setVdef3 ( java.lang.String vdef3) {
this.vdef3=vdef3;
} 
 
/**
* ���� vdef4��Getter����.��������vdef4
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef4() {
return this.vdef4;
} 

/**
* ����vdef4��Setter����.��������vdef4
* ��������:2019-5-17
* @param newVdef4 java.lang.String
*/
public void setVdef4 ( java.lang.String vdef4) {
this.vdef4=vdef4;
} 
 
/**
* ���� vdef5��Getter����.��������vdef5
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef5() {
return this.vdef5;
} 

/**
* ����vdef5��Setter����.��������vdef5
* ��������:2019-5-17
* @param newVdef5 java.lang.String
*/
public void setVdef5 ( java.lang.String vdef5) {
this.vdef5=vdef5;
} 
 
/**
* ���� vdef6��Getter����.��������vdef6
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef6() {
return this.vdef6;
} 

/**
* ����vdef6��Setter����.��������vdef6
* ��������:2019-5-17
* @param newVdef6 java.lang.String
*/
public void setVdef6 ( java.lang.String vdef6) {
this.vdef6=vdef6;
} 
 
/**
* ���� vdef7��Getter����.��������vdef7
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef7() {
return this.vdef7;
} 

/**
* ����vdef7��Setter����.��������vdef7
* ��������:2019-5-17
* @param newVdef7 java.lang.String
*/
public void setVdef7 ( java.lang.String vdef7) {
this.vdef7=vdef7;
} 
 
/**
* ���� vdef8��Getter����.��������vdef8
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef8() {
return this.vdef8;
} 

/**
* ����vdef8��Setter����.��������vdef8
* ��������:2019-5-17
* @param newVdef8 java.lang.String
*/
public void setVdef8 ( java.lang.String vdef8) {
this.vdef8=vdef8;
} 
 
/**
* ���� vdef9��Getter����.��������vdef9
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef9() {
return this.vdef9;
} 

/**
* ����vdef9��Setter����.��������vdef9
* ��������:2019-5-17
* @param newVdef9 java.lang.String
*/
public void setVdef9 ( java.lang.String vdef9) {
this.vdef9=vdef9;
} 
 
/**
* ���� vdef10��Getter����.��������vdef10
*  ��������:2019-5-17
* @return java.lang.String
*/
public java.lang.String getVdef10() {
return this.vdef10;
} 

/**
* ����vdef10��Setter����.��������vdef10
* ��������:2019-5-17
* @param newVdef10 java.lang.String
*/
public void setVdef10 ( java.lang.String vdef10) {
this.vdef10=vdef10;
} 
 
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2019-5-17
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2019-5-17
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("pmbd.pipelinepointclass");
    }
   }
    