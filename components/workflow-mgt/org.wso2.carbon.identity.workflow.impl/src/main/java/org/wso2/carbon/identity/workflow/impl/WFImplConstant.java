/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.identity.workflow.impl;

public class WFImplConstant {

    public static final String WORKFLOW_IMPL_PARAMETER_METADATA_FILE_NAME = "WorkflowImplMetaData.xml" ;
    public static class ParameterName {
        //Template Parameter List
        public static final String STEPS_USER_AND_ROLE = "UserAndRole" ;

        //Workflow Implementation specific parameters
        public static final String BPS_PROFILE = "BPSProfile";
        public static final String HT_SUBJECT = "HTSubject";
        public static final String HT_DESCRIPTION = "HTDescription";

    }
    public static final String DEFAULT_APPROVAL_BPEL_SOAP_ACTION = "http://bpel.mgt.workflow.carbon.wso2" +
                                                                   ".org/approvalProcess/initiate";
}