package nc.bs.pmbd.bd.pressuregrade.ace.bp;

import nc.impl.pubapp.pattern.data.vo.SchemeVOQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.pmbd.bd.pressuregrade.PressuregradeVO;

public class AcePressuregradeBP {

	public PressuregradeVO[] queryByQueryScheme(IQueryScheme querySheme) {
		QuerySchemeProcessor p = new QuerySchemeProcessor(querySheme);
		p.appendFuncPermissionOrgSql();
		return new SchemeVOQuery<PressuregradeVO>(PressuregradeVO.class).query(querySheme,
				null);
	}
}
