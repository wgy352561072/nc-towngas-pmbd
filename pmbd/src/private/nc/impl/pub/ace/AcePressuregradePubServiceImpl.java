package nc.impl.pub.ace;
import nc.bs.pmbd.bd.pressuregrade.ace.bp.AcePressuregradeBP;
import nc.impl.pubapp.pub.smart.SmartServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.ISuperVO;
import nc.vo.pmbd.bd.pressuregrade.PressuregradeVO;
import nc.vo.uif2.LoginContext;

public abstract class AcePressuregradePubServiceImpl extends SmartServiceImpl {
	public PressuregradeVO[] pubquerybasedoc(IQueryScheme querySheme)
			throws nc.vo.pub.BusinessException {
		return new AcePressuregradeBP().queryByQueryScheme(querySheme);
	}
}