package nc.itf.pmbd;

import nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO;
import nc.vo.pub.BusinessException;
import nc.vo.uif2.LoginContext;

public interface IPipelinepointclassMaintain {
	/**
	 * ����һ����������
	 * 
	 * @param context
	 * @param vo
	 * @return
	 * @throws BusinessException
	 */
	public PipelinepointclassVO insertPipelinepointclassVO(LoginContext context, PipelinepointclassVO vo) throws BusinessException;

	/**
	 * �޸�һ����������
	 * 
	 * @param context
	 * @param vo
	 * @return
	 * @throws BusinessException
	 */
	public PipelinepointclassVO updatePipelinepointclassVO(LoginContext context, PipelinepointclassVO vo) throws BusinessException;

	/**
	 * ɾ��һ����������
	 * 
	 * @param context
	 * @param vo
	 * @return
	 * @throws BusinessException
	 */
	public void deletePipelinepointclassVO(LoginContext context, PipelinepointclassVO vo) throws BusinessException;

	/**
	 * ��ѯ���еļ�������
	 * 
	 * @param context
	 * @param c
	 * @return
	 * @throws BusinessException
	 */

	public PipelinepointclassVO[] queryAllIPipelineclass(LoginContext context, String condition) throws BusinessException;

	/**
	 * �ж��Ƿ��¼����Ƿ��״̬
	 * 
	 * @param vo
	 * @return
	 * @throws BusinessException
	 */
	public boolean isLowerLevelSeal(LoginContext context, PipelinepointclassVO vo) throws BusinessException;

	/**
	 * �ж��Ƿ񸸽ڵ�������״̬
	 * 
	 * @param vo
	 * @return
	 * @throws BusinessException
	 */
	public boolean isParentLevelUnSeal(LoginContext context, PipelinepointclassVO vo) throws BusinessException;

	/**
	 * �ж��Ƿ����¼���Ŀ
	 * 
	 * @param context
	 * @param vo
	 * @return
	 * @throws BusinessException
	 * 
	 *             public boolean isHaveChildren(LoginContext context,PipelinepointclassVO vo)
	 *             throws BusinessException;
	 */
	/**
	 * ���䱾��ͺ������ڷ��״̬
	 * 
	 * @param context
	 * @param vo
	 * @return
	 * @throws BusinessException
	 */
	public PipelinepointclassVO[] doSeal(LoginContext context, PipelinepointclassVO vo) throws BusinessException;

	/**
	 * ���䱾������ȡ�����״̬
	 * 
	 * @param context
	 * @param vo
	 * @return
	 * @throws BusinessException
	 */
	public PipelinepointclassVO doUnSeal(LoginContext context, PipelinepointclassVO vo) throws BusinessException;

}