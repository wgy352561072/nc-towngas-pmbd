package nc.impl.pub.ace;

import nc.vo.pmbd.bd.pipelinepointclass.PipelinepointclassVO;
import nc.bs.pmbd.pipelinepointclass.rules.PipelinepointClassCheckCodeRule;
import nc.bs.pmbd.pipelinepointclass.rules.PipelinepointClassInsertRule;
import nc.bs.pmbd.pipelinepointclass.rules.PipelinepointClassUpdateRule;
import nc.impl.pubapp.pattern.data.vo.VODelete;
import nc.impl.pubapp.pattern.data.vo.VOInsert;
import nc.impl.pubapp.pattern.data.vo.VOQuery;
import nc.impl.pubapp.pattern.data.vo.VOUpdate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AcePipelinepointclassPubServiceImpl {

	// 增加方法
	public PipelinepointclassVO inserttreeinfo(PipelinepointclassVO vo) throws BusinessException {
		try {
			// 添加BP规则
			AroundProcesser<PipelinepointclassVO> processer = new AroundProcesser<PipelinepointclassVO>(
					null);
			IRule<PipelinepointclassVO> rule = null;
			rule = new PipelinepointClassCheckCodeRule();
			processer.addBeforeRule(rule);
			rule = new PipelinepointClassInsertRule();
			processer.addBeforeRule(rule);
			processer.before(new PipelinepointclassVO[] { vo });
			VOInsert<PipelinepointclassVO> ins = new VOInsert<PipelinepointclassVO>();
			PipelinepointclassVO[] superVOs = ins.insert(new PipelinepointclassVO[] { vo });
			return superVOs[0];
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除方法
	public void deletetreeinfo(PipelinepointclassVO vo) throws BusinessException {
		try {
			// 添加BP规则
			AroundProcesser<PipelinepointclassVO> processer = new AroundProcesser<PipelinepointclassVO>(
					null);
			processer.before(new PipelinepointclassVO[] { vo });
			VODelete<PipelinepointclassVO> voDel = new VODelete<PipelinepointclassVO>();
			voDel.delete(new PipelinepointclassVO[] { vo });
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}

	}

	// 修改方法
	public PipelinepointclassVO updatetreeinfo(PipelinepointclassVO vo) throws BusinessException {
		try {
			// 添加BP规则
			AroundProcesser<PipelinepointclassVO> processer = new AroundProcesser<PipelinepointclassVO>(
					null);
			IRule<PipelinepointclassVO> rule = null;
			rule = new PipelinepointClassCheckCodeRule();
			processer.addBeforeRule(rule);
			rule = new PipelinepointClassUpdateRule();
			processer.addBeforeRule(rule);
			PipelinepointclassVO[] originVOs = this
					.getTreeCardVOs(new PipelinepointclassVO[] { vo });
			processer.before(new PipelinepointclassVO[] { vo });
			VOUpdate<PipelinepointclassVO> upd = new VOUpdate<PipelinepointclassVO>();
			PipelinepointclassVO[] superVOs = upd.update(new PipelinepointclassVO[] { vo },
					originVOs);
			return superVOs[0];
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	private PipelinepointclassVO[] getTreeCardVOs(PipelinepointclassVO[] vos) {
		String[] ids = this.getIDS(vos);
		VOQuery<PipelinepointclassVO> query = new VOQuery<PipelinepointclassVO>(PipelinepointclassVO.class);
		return query.query(ids);
	}

	private String[] getIDS(PipelinepointclassVO[] vos) {
		int size = vos.length;
		String[] ids = new String[size];
		for (int i = 0; i < size; i++) {
			ids[i] = vos[i].getPrimaryKey();
		}
		return ids;
	}

	// 查询方法
	public PipelinepointclassVO[] querytreeinfo(String whereSql) throws BusinessException {
		VOQuery<PipelinepointclassVO> query = new VOQuery<PipelinepointclassVO>(PipelinepointclassVO.class);
		return query.query(whereSql, null);
	}
}