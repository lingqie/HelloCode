package com.yabou.jpa;

import java.util.List;
import java.util.Map;

public interface Criterion {

	public void contributeWhereClause(List<String> whereClause,
			Map<String, Object> paramMap);
}
