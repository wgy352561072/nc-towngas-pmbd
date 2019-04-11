package nc.bs.pmbd.pressuregrade.rules;

import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.uif.pub.IUifService;
import nc.uif.pub.exception.UifException;
import nc.vo.pmbd.bd.pressuregrade.PressuregradeVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * ѹ���ȼ������ظ�У��
 * @author wugy
 * @version 2019-03-27 09:19:26
 *
 */
public class PressureGradeCheckCodeRule implements IRule<PressuregradeVO> {

	@Override
	public void process(PressuregradeVO[] vos) {
		if (vos == null || vos.length == 0) {
			ExceptionUtils.wrappBusinessException("���ݲ���Ϊ�գ�");
		}
		for (int i = 0; i < vos.length; i++) {
			PressuregradeVO vo = vos[i];
			Object code = vo.getAttributeValue("code");
			if (code == null) {
				ExceptionUtils.wrappBusinessException("ѹ���ȼ����벻��Ϊ�գ�");
			}
			code = vo.getAttributeValue("code").toString();
			Object pk_pressuregrade = vo.getAttributeValue("pk_pressuregrade");
			String existpk = null;
			IUifService service = NCLocator.getInstance().lookup(
					IUifService.class);
			if(pk_pressuregrade == null){//�����ĵ���
				try {
					existpk = (String) service.findColValue(
							"pmbd_pressuregrade", "pk_pressuregrade",
							"code = '" + code + "' and nvl(dr,0) = 0");
				} catch (UifException e) {
					e.printStackTrace();
				}
			}else{//�޸ĵĵ���
				try {
					existpk = (String) service.findColValue(
							"pmbd_pressuregrade", "pk_pressuregrade",
							"code = '" + code + "' and pk_pressuregrade <> '"+pk_pressuregrade.toString()+"' and nvl(dr,0) = 0");
				} catch (UifException e) {
					e.printStackTrace();
				}
			}
			if(existpk != null){
				ExceptionUtils.wrappBusinessException("ѹ���ȼ�����:"+code+"�����ظ���");
			}
		}		
	}
}
