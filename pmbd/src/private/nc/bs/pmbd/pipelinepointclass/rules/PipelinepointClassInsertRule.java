package nc.bs.pmbd.pipelinepointclass.rules;

import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * 新增时，为档案创建人创建时间字段赋值
 * @author wugy
 *
 */
public class PipelinepointClassInsertRule implements IRule<PipelinepointclassVO> {

	@Override
	public void process(PipelinepointclassVO[] vos) {
		if (vos == null || vos.length == 0) {
			ExceptionUtils.wrappBusinessException("数据不能为空！");
		}
		String userid = AppContext.getInstance().getPkUser();
		UFDateTime nowTime = new UFDateTime();
		for (int i = 0; i < vos.length; i++) {
			PipelinepointclassVO vo = vos[i];
			vo.setAttributeValue("creator", userid);
			vo.setAttributeValue("creationtime", nowTime);
		}		
	}
}
