Purpose of this Project:

    This project insert the master data in mongo database in **canvara_master_data** collection.

    This master data is used by various other services and purpose of master data is to validate the data in different-different
    services.

    Example:
            In Design Specification , it is given that Organization types should be only given type, see below:
                "prov", "dept", "team", "govt", "ins", "pay", "edu", "reli", "crs", "cg", "bus", "other"
            so this data is inserted in **canvara_master_data** collection and those services which is using Organization 
            type will get this data and validate the coming data with this data.

    
    State of this project:
        Currently the master data is hard coded in MasterService file but letter on master data will come from application.properties
        file.