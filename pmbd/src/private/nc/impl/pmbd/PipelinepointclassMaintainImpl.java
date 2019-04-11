package nc.impl.pmbd;

import java.util.Collection;
import java.util.Map;

import nc.bs.bd.baseservice.validator.BDTreeUpdateLoopValidator;
import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.bs.pmpub.basedoc.PMBDRefCheck4MuiltFileds;
import nc.bs.pmpub.basedoc.PMCodeTreeBaseService;
import nc.bs.pmpub.util.RefrenceUtil;
import nc.bs.uif2.validation.Validator;
import nc.impl.pubapp.pattern.data.vo.VOQuery;
import nc.itf.pmbd.IPipelinepointclassMaintain;
import nc.md.MDBaseQueryFacade;
import nc.md.data.access.NCObject;
import nc.md.model.IBusinessEntity;
import nc.md.model.MetaDataException;
import nc.vo.bd.meta.IBDObject;
import nc.vo.bd.pub.IPubEnumConst;
import nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO;
import nc.vo.pmbd.bd.pipelinepointclass.util.PipelinepointClassRefrenceUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.uif2.LoginContext;
import nc.vo.util.BDUniqueRuleValidate;
import nc.vo.util.SuperVOTreeStructrueValidator;
import nc.vo.util.VisibleUtil;

/**
 * ���������̨ʵ����
 * @author wangaa
 *
 */
public class PipelinepointclassMaintainImpl extends PMCodeTreeBaseService<PipelinepointclassVO> implements IPipelinepointclassMaintain{
	private static String PP_MDID = null;
	static {
		try {
			// ��ȡԪ����ID
			PP_MDID = MDBaseQueryFacade.getInstance().getBeanByFullClassName(PipelinepointclassVO.class.getName()).getID();
		} catch (MetaDataException e) {
			Logger.error(e.getMessage(), e);
			throw new BusinessRuntimeException(e.getMessage(), e);
		}
	}

	public PipelinepointclassMaintainImpl() {
		super(PP_MDID, null);
	}
    /**
     * <p>
     * ����һ���������ݡ�
     * </p>
     *
     * @param context
     *            ��������
     * @param vo
     *            ���뵵������
     * @return PipelinepointclassVO
     *            ���ؽ��
     * @throws BusinessException
     *             ҵ���쳣
     */
	public PipelinepointclassVO insertPipelinepointclassVO(LoginContext context, PipelinepointclassVO vo) throws BusinessException {
		return insertVO(vo);
	}
    /**
     * <p>
     * ����һ���������ݡ�
     * </p>
     *
     * @param context
     *            ��������
     * @param vo
     *            ���µ�������
     * @return PipelinepointclassVO
     *            ���ؽ��
     * @throws BusinessException
     *            ҵ���쳣
     */
	public PipelinepointclassVO updatePipelinepointclassVO(LoginContext context, PipelinepointclassVO vo) throws BusinessException {

		return updateVO(vo);
	}
    /**
     * <p>
     * ɾ��һ���������ݡ�
     * </p>
     *
     * @param context
     *            ��������
     * @param vo
     *            ɾ����������
     * @return
     *
     * @throws BusinessException
     *            ҵ���쳣
     */
	public void deletePipelinepointclassVO(LoginContext context, PipelinepointclassVO vo) throws BusinessException {
		//�Ƿ�����
		this.checkIsReference(vo);
		//�Ƿ����ӽڵ㣬�ӽڵ��Ƿ�����
		this.isHasChild(vo);
		
		//ɾ��ѡ��������нڵ�
		deleteMultiVOs(vo);
	}

	/**
	 * �Ƿ�����
	 * 
	 * @param vo
	 */
	private void checkIsReference(PipelinepointclassVO vo){
		boolean isRef = false;

		PipelinepointclassVO[] vos = new PipelinepointclassVO[1];
		vos[0] = vo;
		
		isRef = RefrenceUtil.checkIsReference(
				"pmbd_pipelinepointclass", vos,
				new String[] { "pqm_pipelinepointdatas" });
		
		//������
		if (isRef) {
			ExceptionUtils.wrappBusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("acceptbase_0","04801001-0046")/*@res "�����������ڱ����ã�����ɾ�������룺"*/+vo.getAttributeValue("code"));
		}
	}
	
	/**
	 * ��ѯʱ�����ӽڵ�,���ж��ӽڵ��Ƿ�����
	 */
	public void isHasChild(PipelinepointclassVO vo) {
		VOQuery<PipelinepointclassVO> query = new VOQuery<PipelinepointclassVO>(
				PipelinepointclassVO.class);
		StringBuffer condition = new StringBuffer();

		condition.append(" and ").append(PipelinepointclassVO.INNERCODE)
				.append(" like ").append("'").append(vo.getAttributeValue("innercode"))
				.append("%'").append(" and ")
				.append(PipelinepointclassVO.INNERCODE).append(" <> ").append("'")
				.append(vo.getAttributeValue("innercode")).append("'");
		
		PipelinepointclassVO[] vos = query.query(condition.toString(), null);

		boolean isRef = false;
		// �ж�����ڵ��Ƿ�����
		isRef = RefrenceUtil.checkIsReference(
				"pmbd_pipelinepointclass", vos,
				new String[] { "pqm_pipelinepointdatas" });
		if (isRef) {
			ExceptionUtils
					.wrappBusinessException(nc.vo.ml.NCLangRes4VoTransl
							.getNCLangRes().getStrByID("acceptbase_0",
									"04801001-0040")/* @res "���ĵ������ӽڵ㱻���ã�����ɾ����" */);
		}
	}	
	
	/**
	 * ����Ƿ�����
	 */
	private void checkReference(PipelinepointclassVO vo){
		boolean isRef = PipelinepointClassRefrenceUtil.checkIsReference(vo);
		if(isRef){
			ExceptionUtils.wrappBusinessException("�ù��ߵ���౻���ã�����ɾ����");
		}
	}

    /**
     * <p>
     * ͣ�õ������ݡ�
     * </p>
     *
     * @param context
     *            ��������
     * @param vo
     *           ͣ�õ�������
     * @return PipelinepointclassVO
     *           ���ؽ��
     * @throws BusinessException
     *            ҵ���쳣
     */
	@Override
	public PipelinepointclassVO[] doSeal(LoginContext context, PipelinepointclassVO vo) throws BusinessException {
		return disableMutilVO(vo);
	}



    /**
     * <p>
     * ���õ������ݡ�
     * </p>
     *
     * @param context
     *            ��������
     * @param vo
     *           ���õ�������
     * @return PipelinepointclassVO
     *           ���ؽ��
     * @throws BusinessException
     *            ҵ���쳣
     */
	@Override
	public PipelinepointclassVO doUnSeal(LoginContext context, PipelinepointclassVO vo) throws BusinessException {
		return enableVO(vo);
	}

	@Override
	// �ж��¼��ڵ��Ƿ񶼴���ͣ��״̬
	public boolean isLowerLevelSeal(LoginContext context, PipelinepointclassVO vo) throws BusinessException {
		BaseDAO basedao = new BaseDAO();
		PipelinepointclassVO[] returnCategory;
		String whereSql = PipelinepointclassVO.INNERCODE + " like '" + vo.getAttributeValue("innercode") + "%'" + " and " + PipelinepointclassVO.ENABLESTATE + " = "
				+ IPubEnumConst.ENABLESTATE_ENABLE + " and " + PipelinepointclassVO.PK_GROUP + " = '" + vo.getAttributeValue("pk_group") + "'";

		// �õ����ص�û�з���VO
		Collection<PipelinepointclassVO> acvo = basedao.retrieveByClause(PipelinepointclassVO.class, whereSql);
		returnCategory = acvo.toArray(new PipelinepointclassVO[0]);
		boolean isAllSeal = true;
		if (returnCategory.length <= 1) {
			isAllSeal = false;
		}
		return isAllSeal;
	}

    /**
     * <p>
     * �жϸ��ڵ��Ƿ�����
     * </p>
     *
     * @param context
     *            ��������
     * @param vo
     *            ��ǰ��������
     * @return boolean
     *            ���ؽ��
     * @throws BusinessException
     *             ҵ���쳣
     */
	@Override
	public boolean isParentLevelUnSeal(LoginContext context, PipelinepointclassVO vo) throws BusinessException {
		BaseDAO basedao = new BaseDAO();
		PipelinepointclassVO[] returnCategory;
		String whereSql = PipelinepointclassVO.PK_PIPELINEPOINTCLASS + " = " + "'" + vo.getAttributeValue("pk_parent") + "'";
		Collection<PipelinepointclassVO> acparent_vo = basedao.retrieveByClause(PipelinepointclassVO.class, whereSql);
		returnCategory = acparent_vo.toArray(new PipelinepointclassVO[0]);
		if (returnCategory.length == 0) {
			return true;

		}
		if ((int)returnCategory[0].getAttributeValue("enablestate") == 2)
			return true;
		return false;
	}

    /**
     * <p>
     * ��ѯ
     * </p>
     *
     * @param context
     *            ��������
     * @param condition
     *            ��ѯ����
     * @return PipelinepointclassVO
     *            ���ؽ��
     * @throws BusinessException
     *             ҵ���쳣
     */
	@Override
	public PipelinepointclassVO[] queryAllIPipelineclass(LoginContext context, String condition) throws BusinessException {
		// ����

		// �ܿ�ģʽ�µĿɼ���
		String visible = VisibleUtil.getVisibleCondition(context, PP_MDID);
		if (condition == null) {
			condition = visible;
		} else
			condition = condition + " and " + visible;

		BaseDAO basedao = new BaseDAO();
		Collection<PipelinepointclassVO> pp = basedao.retrieveByClause(PipelinepointclassVO.class, condition, PipelinepointclassVO.CODE);

		return pp.toArray(new PipelinepointclassVO[0]);
	}

	@Override
	protected Validator[] getUpdateValidator(PipelinepointclassVO oldVO) {
		String codeField = getCodeFieldName(oldVO);
		Validator[] validators = new Validator[] { new BDTreeUpdateLoopValidator(), new BDUniqueRuleValidate(),new PMBDRefCheck4MuiltFileds(new String[]{codeField})};
		return validators;
	}
	@Override
	protected Validator[] getInsertValidator() {
		Validator[] validators = new Validator[] {new BDUniqueRuleValidate(),
				new SuperVOTreeStructrueValidator(PipelinepointclassVO.PK_PARENT) };
		return validators;
	}

	private String getCodeFieldName(SuperVO vo) {
		if (vo == null) {
			return null;
		}
		NCObject ncObj = NCObject.newInstance(vo);

		Map<String, String> flowBizInfoMap = (Map<String, String>) ((IBusinessEntity) ncObj.getRelatedBean()).getBizInterfaceMapInfo(IBDObject.class.getName());
		String codeField = flowBizInfoMap.get(PipelinepointclassVO.CODE);
		return codeField;
	}

	@Override
	protected void writeEnableBusiLog(PipelinepointclassVO vo)
			throws BusinessException {
	}
	@Override
	protected void writeInsertBusiLog(PipelinepointclassVO... vos)
			throws BusinessException {
	}
	@Override
	protected void writeUpdatedBusiLog(PipelinepointclassVO[] oldVOs,
			PipelinepointclassVO[] vos) throws BusinessException {
	}
}