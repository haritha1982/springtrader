/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.nanotrader.data.service;


import java.util.List;

import org.springframework.nanotrader.data.domain.Accountprofile;

public interface AccountProfileService {

	public abstract long countAllAccountProfiles();

	public abstract void deletelAccountProfile(Accountprofile accountProfile);

	public abstract Accountprofile findAccountProfile(Integer id);

	public abstract List<Accountprofile> findAllAccountProfiles();

	public abstract List<Accountprofile> findAccountProfileEntries(int firstResult, int maxResults);

	public abstract void saveAccountProfile(Accountprofile accountProfile);

	public abstract Accountprofile updateAccountProfile(Accountprofile accountProfile);
	
	public abstract Accountprofile findByUseridAndPasswd(String userId, String passwd);
}
