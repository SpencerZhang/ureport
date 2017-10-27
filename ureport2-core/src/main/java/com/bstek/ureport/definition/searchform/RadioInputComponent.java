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
package com.bstek.ureport.definition.searchform;

import java.util.List;

/**
 * @author Jacky.gao
 * @since 2017年10月23日
 */
public class RadioInputComponent extends InputComponent {
	private boolean optionsInline;
	private List<Option> options;
	@Override
	String inputHtml(RenderContext context) {
		StringBuilder sb=new StringBuilder();
		String name=getBindParameter();
		sb.append("<div>");
		for(Option option:options){
			if(this.optionsInline){
				sb.append("<label class='checkbox-inline' style='padding-left:0px'><input value='"+option.getValue()+"' type='radio' name='"+name+"'> "+option.getLabel()+"</label>");
			}else{
				sb.append("<label class='checkbox'><input value='"+option.getValue()+"' type='radio' name='"+name+"' style='margin-left: auto'> "+option.getLabel()+"</label>");
			}
		}
		sb.append("</div>");
		return sb.toString();
	}
	@Override
	public String initJs(RenderContext context) {
		return "";
	}
	public void setOptionsInline(boolean optionsInline) {
		this.optionsInline = optionsInline;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	@Override
	public String toHtml(RenderContext context) {
		StringBuilder sb=new StringBuilder();
		return sb.toString();
	}
}
