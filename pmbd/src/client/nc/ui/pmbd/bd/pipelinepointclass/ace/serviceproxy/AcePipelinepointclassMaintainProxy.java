package nc.ui.pmbd.bd.pipelinepointclass.ace.serviceproxy;

import nc.itf.pmbd.IPipelinepointclassMaintain;
import nc.itf.pmbd.acceptchecktype.prv.IAccheckType;
import nc.ui.pmpub.basedoc.treecard.model.TreeCardAppModelService;
import nc.vo.pm.proxy.PMProxy;
import nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO;
import nc.vo.pub.BusinessException;
import nc.vo.uif2.LoginContext;

/**
 * �������������
 * @author wangaa
 *
 */
public class AcePipelinepointclassMaintainProxy extends TreeCardAppModelService{

	protected LoginContext context;

	public static IPipelinepointclassMaintain getPPService() {
		return PMProxy.lookup(IPipelinepointclassMaintain.class);
	}

	/**
     * <p>
     * �����������ݡ�
     * </p>
     * 
     * @param context
     *            ��������
     * @param object
     *            ������������            
     * @return AssessclassmentVO
     *            ���ؽ��
     * @throws BusinessException
     *             ҵ���쳣
     */
	@Override
	public Object insert(Object object) throws Exception {
		if (object instanceof PipelinepointclassVO) {
			return getPPService().insertPipelinepointclassVO(getContext(), (PipelinepointclassVO) object);
		}
		return object;
	}
	/**
     * <p>
     * ��ѯ�������ݡ�
     * </p>
     * 
     * @param context
     *            ��������
     * @param object
     *            ��ѯ��������            
     * @return AssessclassmentVO
     *            ���ؽ��
     * @throws BusinessException
     *             ҵ���쳣
     */
	@Override
	public Object[] queryByDataVisibilitySetting(LoginContext context) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	/**
     * <p>
     * �޸ĵ������ݡ�
     * </p>
     * 
     * @param context
     *            ��������
     * @param object
     *            �޸ĵ�������            
     * @return AssessclassmentVO
     *            ���ؽ��
     * @throws BusinessException
     *             ҵ���쳣
     */
	@Override
	public Object update(Object object) throws Exception {
		if (object instanceof PipelinepointclassVO) {
			return getPPService().updatePipelinepointclassVO(getContext(), (PipelinepointclassVO) object);
		}
		return null;
	}
    /**
     * <p>
     * ɾ���������ݡ�
     * </p>
     * 
     * @param context
     *            ��������
     * @param object
     *            ɾ����������            
     * @throws BusinessException
     *             ҵ���쳣
     */
	@Override
	public void delete(Object object) throws Exception {
		if (object instanceof PipelinepointclassVO) {
			getPPService().deletePipelinepointclassVO(context, (PipelinepointclassVO)object);
		}
	}
	/**
     * <p>
     * ͣ�õ������ݡ�
     * </p>
     * 
     * @param context
     *            ��������
     * @param object
     *            ͣ�õ�������            
     * @return AssessclassmentVO
     *            ���ؽ��
     * @throws BusinessException
     *             ҵ���쳣
     */
	public Object[] doSeal(LoginContext context, Object obj) throws Exception {
		PipelinepointclassVO vo = (PipelinepointclassVO) obj;

		return getPPService().doSeal(context, vo);
	}
    /**
     * <p>
     * ���õ������ݡ�
     * </p>
     * 
     * @param context
     *            ��������
     * @param object
     *            ���õ�������            
     * @return AssessclassmentVO
     *            ���ؽ��
     * @throws BusinessException
     *             ҵ���쳣
     */
	public Object doUnSeal(LoginContext context, Object obj) throws Exception {
		PipelinepointclassVO vo = (PipelinepointclassVO) obj;

		return getPPService().doUnSeal(context, vo);
	}
	/**
     * <p>
     * �ж��ӽڵ㵵���Ƿ�ͣ��
     * </p>
     * 
     * @param context
     *            ��������
     * @param object
     *           �ж��ӽڵ㵵���Ƿ�ͣ��         
     * @return boolean
     *            ���ؽ��
     * @throws BusinessException
     *             ҵ���쳣
     */
	public boolean isLowerLevelSeal(LoginContext context, Object obj) throws Exception {
		PipelinepointclassVO vo = (PipelinepointclassVO) obj;

		return getPPService().isLowerLevelSeal(context, vo);
	}
    /**
     * <p>
     * �жϸ��ڵ��Ƿ�����
     * </p>
     * 
     * @param context
     *            ��������
     * @param object
     *           �жϸ��ڵ��Ƿ�����  
     * @return boolean
     *            ���ؽ��
     * @throws BusinessException
     *             ҵ���쳣
     */
	public boolean isParentLevelUnSeal(LoginContext context, Object obj) throws Exception {
		PipelinepointclassVO vo = (PipelinepointclassVO) obj;

		return getPPService().isParentLevelUnSeal(context, vo);
	}

	/*
	 * public boolean isHaveChildren(LoginContext context, Object obj) throws
	 * Exception { AssessclassmentVO vo = (AssessclassmentVO) obj;
	 * 
	 * return getACService().isHaveChildren(context, vo); }
	 */
    /**
     * <p>
     * ���ݴ���Ĳ�ѯ������ѯ����
     * </p>
     * 
     * @param context
     *            ��������
     * @param object
     *           �жϸ��ڵ��Ƿ�����  
     * @return AssessclassmentVO
     *            ���ؽ��
     * @throws BusinessException
     *             ҵ���쳣
     */
	public PipelinepointclassVO[] queryAllAssessclassment(LoginContext context, String condition) throws Exception {
		return getPPService().queryAllIPipelineclass(context, condition);
	}

	public LoginContext getContext() {
		return context;
	}

	public void setContext(LoginContext context) {
		this.context = context;
	}

}
