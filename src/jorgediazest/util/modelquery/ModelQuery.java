/**
 * Copyright (c) 2015-present Jorge Díaz All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package jorgediazest.util.modelquery;

import com.liferay.portal.kernel.dao.orm.Criterion;

import java.util.List;
import java.util.Map;

import jorgediazest.util.data.Data;
import jorgediazest.util.data.DataComparator;
import jorgediazest.util.model.Model;
import jorgediazest.util.modelquery.ModelQueryFactory.DataComparatorFactory;

/**
 * @author Jorge Díaz
 */
public interface ModelQuery extends Comparable<ModelQuery> {

	public void addRelatedModelData(
			Map<Long, Data> dataMap, String classNameRelated,
			String[] attrRelated, String[] mappings, boolean removeNotMatched,
			boolean rawData)
		throws Exception;

	public void addRelatedModelData(
			Map<Long, Data> dataMap, String classNameRelated,
			String[] attrRelated, String[] mappings, boolean removeNotMatched,
			boolean rawData, Criterion filter)
		throws Exception;

	public Map<Long, Data> getData() throws Exception;

	public Map<Long, Data> getData(Criterion filter) throws Exception;

	public Map<Long, Data> getData(String[] attributes) throws Exception;

	public Map<Long, Data> getData(String[] attributes, Criterion filter)
		throws Exception;

	public Map<Long, Data> getData(String[] attributes, String mapKeyAttribute)
		throws Exception;

	public Map<Long, Data> getData(
			String[] attributes, String mapKeyAttribute, Criterion filter)
		throws Exception;

	public Map<Long, Data> getData(
			String[] attributesModel, String[] attributesRelated,
			Criterion filter)
		throws Exception;

	public Map<Long, Data> getData(
			String[] attributesModel, String[] attributesRelated,
			String mapKeyAttribute, Criterion filter)
		throws Exception;

	public DataComparator getDataComparator();

	public Map<Long, Data> getDataWithCache() throws Exception;

	public Map<Long, Data> getDataWithCache(String[] attributes)
		throws Exception;

	public Map<Long, Data> getDataWithCache(
			String[] attributes, String mapKeyAttribute)
		throws Exception;

	public Map<Long, List<Data>> getDataWithDuplicates(
		String[] attributes, String mapKeyAttribute)
	throws Exception;

	public Map<Long, List<Data>> getDataWithDuplicates(
		String[] attributes, String mapKeyAttribute, Criterion filter)
	throws Exception;

	public Map<Long, List<Data>> getDataWithDuplicatesCache(
		String[] attributes, String mapKeyAttribute)
	throws Exception;

	public Model getModel();

	public ModelQueryFactory getModelQueryFactory();

	public void init(Model model, DataComparatorFactory dataComparatorFactory)
		throws Exception;

	public void setModelQueryFactory(ModelQueryFactory modelDataAccessFactory);

}