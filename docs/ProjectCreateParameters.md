

# ProjectCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A name for the Project. | 
**memoryId** | **Integer** | The Memory to associate with this new Project. | 
**jobId** | **Integer** | The Job to associate with this new Project. If a Job ID is not provided then a new Job will be created to contain the Project.  |  [optional]
**dueDate** | **Integer** | The due date. Measured in seconds since the Unix epoch. |  [optional]
**metadata** | **Object** | A JSON object of key/value string pairs. Stores custom project information. |  [optional]
**workflowTemplateId** | **Integer** | The workflow template used to create this project. WorkflowTemplateIds can be retrieved via the /workflows/templates endpoint. If not specified then the organization default workflowTemplateId will be used. |  [optional]



