/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.jaq.transform.v20160412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.jaq.model.v20160412.GetShieldResultResponse;
import com.aliyuncs.jaq.model.v20160412.GetShieldResultResponse.Data;
import com.aliyuncs.jaq.model.v20160412.GetShieldResultResponse.Data.ObfuscateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetShieldResultResponseUnmarshaller {

	public static GetShieldResultResponse unmarshall(GetShieldResultResponse getShieldResultResponse, UnmarshallerContext context) {
		
		getShieldResultResponse.setErrorCode(context.integerValue("GetShieldResultResponse.ErrorCode"));
		getShieldResultResponse.setErrorMsg(context.stringValue("GetShieldResultResponse.ErrorMsg"));

		Data data = new Data();
		data.setTaskStatus(context.integerValue("GetShieldResultResponse.Data.TaskStatus"));

		List<String> appList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetShieldResultResponse.Data.AppList.Length"); i++) {
			appList.add(context.stringValue("GetShieldResultResponse.Data.AppList["+ i +"]"));
		}
		data.setAppList(appList);

		ObfuscateResult obfuscateResult = new ObfuscateResult();
		obfuscateResult.setObfuscatedClasses(context.integerValue("GetShieldResultResponse.Data.ObfuscateResult.ObfuscatedClasses"));
		obfuscateResult.setObfuscatedFields(context.integerValue("GetShieldResultResponse.Data.ObfuscateResult.ObfuscatedFields"));
		obfuscateResult.setObfuscatedMethods(context.integerValue("GetShieldResultResponse.Data.ObfuscateResult.ObfuscatedMethods"));
		obfuscateResult.setTotalClasses(context.integerValue("GetShieldResultResponse.Data.ObfuscateResult.TotalClasses"));
		obfuscateResult.setTotalFields(context.integerValue("GetShieldResultResponse.Data.ObfuscateResult.TotalFields"));
		obfuscateResult.setTotalMethods(context.integerValue("GetShieldResultResponse.Data.ObfuscateResult.TotalMethods"));
		obfuscateResult.setObfuscatedPercent(context.floatValue("GetShieldResultResponse.Data.ObfuscateResult.ObfuscatedPercent"));
		data.setObfuscateResult(obfuscateResult);
		getShieldResultResponse.setData(data);
	 
	 	return getShieldResultResponse;
	}
}