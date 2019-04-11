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
 *  ��������:2019-4-2
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class PipelinepointclassVO extends SuperVO {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2019-4-2
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return (UFDateTime)this.getAttributeValue(PipelinepointclassVO.TS);
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2019-4-2
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.setAttributeValue(PipelinepointclassVO.TS,ts);
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("pmbd.pipelinepointclass");
    }
   }
    