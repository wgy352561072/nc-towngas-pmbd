package nc.bs.pmbd.pipelinepointclass.rules;

import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * 修改时，为档案修改人和修改时间赋值
 * @author wugy
 *
 */
public class PipelinepointClassUpdateRule implements IRule<PipelinepointclassVO> {

	@Override
	public void process(PipelinepointclassVO[] vos) {
		if (vos == null || vos.length == 0) {
			ExceptionUtils.wrappBusinessException("数据不能为空！");
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
