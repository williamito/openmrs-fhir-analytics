// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package org.openmrs.analytics.model;

import java.util.LinkedHashMap;

import lombok.Getter;
import lombok.Setter;

public class EventConfiguration {
	
	@Getter
	@Setter
	private boolean enabled;
	
	@Getter
	@Setter
	private String title;
	
	@Getter
	@Setter
	private String parentForeignKey;
	
	@Getter
	@Setter
	private String childPrimaryKey;
	
	@Getter
	@Setter
	private String parentTable;
	
	@Getter
	@Setter
	private LinkedHashMap<String, String> linkTemplates;
	
	@Getter
	@Setter
	private String databaseHostName;
	
	@Getter
	@Setter
	private int databasePort;
	
	@Getter
	@Setter
	private String databaseUser;
	
	@Getter
	@Setter
	private String databasePassword;
	
	@Getter
	@Setter
	private String databaseName;
	
	@Getter
	@Setter
	private int databaseServerId;
	
	@Getter
	@Setter
	private String databaseServerName;
	
	@Getter
	@Setter
	private String databaseSchema;
	
	@Getter
	@Setter
	private String databaseOffsetStorage;
	
	@Getter
	@Setter
	private String databaseHistory;
	
	@Getter
	@Setter
	private String snapshotMode;
}
