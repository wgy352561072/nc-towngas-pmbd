package nc.itf.pmbd;

import nc.vo.bd.meta.BatchOperateVO;
import nc.vo.pmbd.bd.pressuregrade.PressuregradeVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.uif2.LoginContext;

/**
 * 
 * <p>
 * <b>������Ҫ������¹��ܣ�</b>
 * 
 * <ul>
 * <li>�����ĺ�̨����
 * </ul>
 * 
 * <p>
 * <p>
 * 
 * @version 6.0
 * @since 6.0
 * @author zhangzhxa
 * @time 2011-12-23 ����08:58:35
 */
public interface IPressuregradeMaintain {
	/**
	 * 
	 * ����������������������
	 * <p>
	 * <b>����˵��</b>
	 * 
	 * @param vo
	 * @return
	 * @throws BusinessException
	 *             <p>
	 * @since 6.0
	 * @author zhangzhxa
	 * @time 2011-12-23 ����09:22:43
	 */
	BatchOperateVO batchSave(BatchOperateVO vo) throws BusinessException;

	/**
	 * 
	 * ������������������ͣ��
	 * <p>
	 * <b>����˵��</b>
	 * 
	 * @param vo
	 * @return
	 * @throws BusinessException
	 *             <p>
	 * @since 6.0
	 * @author zhangzhxa
	 * @time 2011-12-23 ����09:23:18
	 */
	PressuregradeVO[] disEnable(PressuregradeVO[] vo) throws BusinessException;

	/**
	 * 
	 * ����������������������
	 * <p>
	 * <b>����˵��</b>
	 * 
	 * @param vo
	 * @return
	 * @throws BusinessException
	 *             <p>
	 * @since 6.0
	 * @author zhangzhxa
	 * @time 2011-12-23 ����09:23:06
	 */
	PressuregradeVO[] enable(PressuregradeVO[] vo) throws BusinessException;

	/**
	 * 
	 * ����������������ʼ������ʱ����ѯ����
	 * <p>
	 * <b>����˵��</b>
	 * 
	 * @param context
	 * @param className
	 * @param whereSql
	 * @return
	 * @throws BusinessException
	 *             <p>
	 * @since 6.0
	 * @author zhangzhxa
	 * @time 2011-12-23 ����10:25:02
	 */
	SuperVO[] queryVOsByWhereSql(LoginContext context,  String whereSql) throws BusinessException;
	
	PressuregradeVO[] insert(PressuregradeVO[] vo) throws BusinessException;

	PressuregradeVO[] update(PressuregradeVO[] vo) throws BusinessException;

	void delete(PressuregradeVO[] vo) throws BusinessException;


}
