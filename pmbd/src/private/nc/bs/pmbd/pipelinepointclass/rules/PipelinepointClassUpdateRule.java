package nc.bs.pmbd.pipelinepointclass.rules;

import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * �޸�ʱ��Ϊ�����޸��˺��޸�ʱ�丳ֵ
 * @author wugy
 *
 */
public class PipelinepointClassUpdateRule implements IRule<PipelinepointclassVO> {

	@Override
	public void process(PipelinepointclassVO[] vos) {
		if (vos == null || vos.length == 0) {
			ExceptionUtils.wrappBusinessException("���ݲ���Ϊ�գ�");
		}
		String userid = AppContext.getInstance().getPkUser();
		UFDateTime nowTime = new UFDateTime();
		for (int i = 0; i < vos.length; i++) {
			PipelinepointclassVO vo = vos[i];
			vo.setAttributeValue("modifier", userid);
			vo.setAttributeValue("modifiedtime", nowTime);
		}		
	}
}
