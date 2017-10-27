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
package com.bstek.ureport.build.assertor;

import java.util.List;

/**
 * @author Jacky.gao
 * @since 2017年9月15日
 */
public abstract class AbstractAssertor implements Assertor{
	protected Object buildObject(Object obj){
		if(obj==null){
			return obj;
		}
		if(obj instanceof List){
			List<?> list=(List<?>)obj;
			if(list.size()==1){
				return list.get(0);
			}
		}
		return obj;
	}
}
