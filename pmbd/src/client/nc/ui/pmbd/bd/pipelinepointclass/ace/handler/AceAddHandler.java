package nc.ui.pmbd.bd.pipelinepointclass.ace.handler;

import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.billform.AddEvent;
import nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pubapp.AppContext;
import nc.ui.pub.beans.UIRefPane;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pub.bill.BillItem;

public class AceAddHandler implements IAppEventHandler<AddEvent> {

	@Override
	public void handleAppEvent(AddEvent e) {
		String pk_group = e.getContext().getPk_group();
		String pk_org = e.getContext().getPk_org();
		BillCardPanel panel = e.getBillForm().getBillCardPanel();
		// 设置主组织默认值
		panel.setHeadItem("pk_group", pk_group);
		panel.setHeadItem("pk_org", pk_org);
		
		BillItem parentCode = e.getBillForm().getBillCardPanel()
				.getHeadItem("pk_parent");
		if (e.getBillForm().getModel().getSelectedData() != null) {
			PipelinepointclassVO vo = (PipelinepointclassVO) e
					.getBillForm().getModel().getSelectedData();
			((UIRefPane)parentCode.getComponent()).setPK(vo.getPrimaryKey());
			//parentCode.setValue(vo.getPrimaryKey());
			parentCode.setEdit(false);
		} else{
			parentCode.setEdit(true);
		}
	}
}
