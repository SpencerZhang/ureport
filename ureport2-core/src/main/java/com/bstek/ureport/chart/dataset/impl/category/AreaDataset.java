/*******************************************************************************
 * Copyright (C) 2017 Bstek.com
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.bstek.ureport.chart.dataset.impl.category;

import com.bstek.ureport.build.Context;
import com.bstek.ureport.model.Cell;

/**
 * @author Jacky.gao
 * @since 2017年6月8日
 */
public class AreaDataset extends LineDataset {
	@Override
	public String buildDataJson(Context context,Cell cell) {
		String props="\"fill\":true";
		String datasetJson=buildDatasetJson(context, cell,props);
		StringBuilder sb=new StringBuilder();
		sb.append("{");
		String labels=getLabels();
		sb.append("\"labels\":"+labels+",");
		sb.append("\"datasets\":["+datasetJson+"]");
		sb.append("}");
		return sb.toString();
	}
	@Override
	public String getType() {
		return "line";
	}
}
