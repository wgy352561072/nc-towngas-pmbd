package nc.bs.pmbd.pipelinepointclass.rules;

import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.uif.pub.IUifService;
import nc.uif.pub.exception.UifException;
import nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * 管线点分类保存前校验编码唯一规则
 * 
 * @author wugy
 * @since 2019-03-21
 * 
 */
public class PipelinepointClassCheckCodeRule implements
		IRule<PipelinepointclassVO> {

	@Override
	public void process(PipelinepointclassVO[] vos) {
		if (vos == null || vos.length == 0) {
			ExceptionUtils.wrappBusinessException("数据不能为空！");
		}
		for (int i = 0; i < vos.length; i++) {
			PipelinepointclassVO vo = vos[i];
			Object code = vo.getAttributeValue("code");
			if (code == null) {
				ExceptionUtils.wrappBusinessException("管线点分类编码不能为空！");
			}
			code = vo.getAttributeValue("code").toString();
			Object pk_pipelinepointclass = vo.getAttributeValue("pk_pipelinepointclass");
			String existpk = null;
			IUifService service = NCLocator.getInstance().lookup(
					IUifService.class);
			if(pk_pipelinepointclass == null){//新增的单据
				try {
					existpk = (String) service.findColValue(
							"pmbd_pipelinepointclass", "pk_pipelinepointclass",
							"code = '" + code + "' and nvl(dr,0) = 0");
				} catch (UifException e) {
					e.printStackTrace();
				}
			}else{//修改的单据
				try {
					existpk = (String) service.findColValue(
							"pmbd_pipelinepointclass", "pk_pipelinepointclass",
							"code = '" + code + "' and pk_pipelinepointclass <> '"+pk_pipelinepointclass.toString()+"' and nvl(dr,0) = 0");
				} catch (UifException e) {
					e.printStackTrace();
				}
			}
			if(existpk != null){
				ExceptionUtils.wrappBusinessException("管线点分类编码存在重复！");
			}
		}
	}

}
