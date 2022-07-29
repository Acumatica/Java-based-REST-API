/*
 * Default/20.200.001
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 4
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * BusinessAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T18:06:51.194Z")
public class BusinessAccount extends Entity {
  @SerializedName("AccountRef")
  private StringValue accountRef = null;

  @SerializedName("Activities")
  private List<ActivityDetail> activities = null;

  @SerializedName("Attributes")
  private List<AttributeValue> attributes = null;

  @SerializedName("BusinessAccountID")
  private StringValue businessAccountID = null;

  @SerializedName("Campaigns")
  private List<CampaignDetail> campaigns = null;

  @SerializedName("Cases")
  private List<BusinessAccountCaseDetail> cases = null;

  @SerializedName("ClassID")
  private StringValue classID = null;

  @SerializedName("Contacts")
  private List<BusinessAccountContact> contacts = null;

  @SerializedName("Contracts")
  private List<BusinessAccountContract> contracts = null;

  @SerializedName("DefaultLocationSettings")
  private BusinessAccountDefaultLocationSetting defaultLocationSettings = null;

  @SerializedName("Duplicate")
  private StringValue duplicate = null;

  @SerializedName("Duplicates")
  private List<DuplicateDetail> duplicates = null;

  @SerializedName("LastIncomingActivity")
  private DateTimeValue lastIncomingActivity = null;

  @SerializedName("LastModifiedDateTime")
  private DateTimeValue lastModifiedDateTime = null;

  @SerializedName("LastOutgoingActivity")
  private DateTimeValue lastOutgoingActivity = null;

  @SerializedName("Locations")
  private List<BusinessAccountLocation> locations = null;

  @SerializedName("MainAddress")
  private Address mainAddress = null;

  @SerializedName("MainAddressValidated")
  private BooleanValue mainAddressValidated = null;

  @SerializedName("MainContact")
  private BusinessAccountMainContact mainContact = null;

  @SerializedName("MarketingLists")
  private List<MarketingListDetail> marketingLists = null;

  @SerializedName("Name")
  private StringValue name = null;

  @SerializedName("Opportunities")
  private List<BusinessAccountOpportunityDetail> opportunities = null;

  @SerializedName("Orders")
  private List<BusinessAccountOrder> orders = null;

  @SerializedName("Owner")
  private StringValue owner = null;

  @SerializedName("OwnerEmployeeName")
  private StringValue ownerEmployeeName = null;

  @SerializedName("ParentAccount")
  private StringValue parentAccount = null;

  @SerializedName("PrimaryContact")
  private Contact primaryContact = null;

  @SerializedName("Relations")
  private List<RelationDetail> relations = null;

  @SerializedName("ShippingAddress")
  private Address shippingAddress = null;

  @SerializedName("ShippingAddressOverride")
  private BooleanValue shippingAddressOverride = null;

  @SerializedName("ShippingAddressValidated")
  private BooleanValue shippingAddressValidated = null;

  @SerializedName("ShippingContact")
  private BusinessAccountShippingContact shippingContact = null;

  @SerializedName("SourceCampaign")
  private StringValue sourceCampaign = null;

  @SerializedName("Status")
  private StringValue status = null;

  @SerializedName("Type")
  private StringValue type = null;

  @SerializedName("Workgroup")
  private StringValue workgroup = null;

  @SerializedName("WorkgroupDescription")
  private StringValue workgroupDescription = null;

  @SerializedName("NoteID")
  private GuidValue noteID = null;

  public BusinessAccount accountRef(StringValue accountRef) {
    this.accountRef = accountRef;
    return this;
  }

   /**
   * Get accountRef
   * @return accountRef
  **/
  @ApiModelProperty(value = "")
  public StringValue getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(StringValue accountRef) {
    this.accountRef = accountRef;
  }

  public BusinessAccount activities(List<ActivityDetail> activities) {
    this.activities = activities;
    return this;
  }

  public BusinessAccount addActivitiesItem(ActivityDetail activitiesItem) {
    if (this.activities == null) {
      this.activities = new ArrayList<>();
    }
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * Get activities
   * @return activities
  **/
  @ApiModelProperty(value = "")
  public List<ActivityDetail> getActivities() {
    return activities;
  }

  public void setActivities(List<ActivityDetail> activities) {
    this.activities = activities;
  }

  public BusinessAccount attributes(List<AttributeValue> attributes) {
    this.attributes = attributes;
    return this;
  }

  public BusinessAccount addAttributesItem(AttributeValue attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public List<AttributeValue> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AttributeValue> attributes) {
    this.attributes = attributes;
  }

  public BusinessAccount businessAccountID(StringValue businessAccountID) {
    this.businessAccountID = businessAccountID;
    return this;
  }

   /**
   * Get businessAccountID
   * @return businessAccountID
  **/
  @ApiModelProperty(value = "")
  public StringValue getBusinessAccountID() {
    return businessAccountID;
  }

  public void setBusinessAccountID(StringValue businessAccountID) {
    this.businessAccountID = businessAccountID;
  }

  public BusinessAccount campaigns(List<CampaignDetail> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  public BusinessAccount addCampaignsItem(CampaignDetail campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * Get campaigns
   * @return campaigns
  **/
  @ApiModelProperty(value = "")
  public List<CampaignDetail> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<CampaignDetail> campaigns) {
    this.campaigns = campaigns;
  }

  public BusinessAccount cases(List<BusinessAccountCaseDetail> cases) {
    this.cases = cases;
    return this;
  }

  public BusinessAccount addCasesItem(BusinessAccountCaseDetail casesItem) {
    if (this.cases == null) {
      this.cases = new ArrayList<>();
    }
    this.cases.add(casesItem);
    return this;
  }

   /**
   * Get cases
   * @return cases
  **/
  @ApiModelProperty(value = "")
  public List<BusinessAccountCaseDetail> getCases() {
    return cases;
  }

  public void setCases(List<BusinessAccountCaseDetail> cases) {
    this.cases = cases;
  }

  public BusinessAccount classID(StringValue classID) {
    this.classID = classID;
    return this;
  }

   /**
   * Get classID
   * @return classID
  **/
  @ApiModelProperty(value = "")
  public StringValue getClassID() {
    return classID;
  }

  public void setClassID(StringValue classID) {
    this.classID = classID;
  }

  public BusinessAccount contacts(List<BusinessAccountContact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public BusinessAccount addContactsItem(BusinessAccountContact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(value = "")
  public List<BusinessAccountContact> getContacts() {
    return contacts;
  }

  public void setContacts(List<BusinessAccountContact> contacts) {
    this.contacts = contacts;
  }

  public BusinessAccount contracts(List<BusinessAccountContract> contracts) {
    this.contracts = contracts;
    return this;
  }

  public BusinessAccount addContractsItem(BusinessAccountContract contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

   /**
   * Get contracts
   * @return contracts
  **/
  @ApiModelProperty(value = "")
  public List<BusinessAccountContract> getContracts() {
    return contracts;
  }

  public void setContracts(List<BusinessAccountContract> contracts) {
    this.contracts = contracts;
  }

  public BusinessAccount defaultLocationSettings(BusinessAccountDefaultLocationSetting defaultLocationSettings) {
    this.defaultLocationSettings = defaultLocationSettings;
    return this;
  }

   /**
   * Get defaultLocationSettings
   * @return defaultLocationSettings
  **/
  @ApiModelProperty(value = "")
  public BusinessAccountDefaultLocationSetting getDefaultLocationSettings() {
    return defaultLocationSettings;
  }

  public void setDefaultLocationSettings(BusinessAccountDefaultLocationSetting defaultLocationSettings) {
    this.defaultLocationSettings = defaultLocationSettings;
  }

  public BusinessAccount duplicate(StringValue duplicate) {
    this.duplicate = duplicate;
    return this;
  }

   /**
   * Get duplicate
   * @return duplicate
  **/
  @ApiModelProperty(value = "")
  public StringValue getDuplicate() {
    return duplicate;
  }

  public void setDuplicate(StringValue duplicate) {
    this.duplicate = duplicate;
  }

  public BusinessAccount duplicates(List<DuplicateDetail> duplicates) {
    this.duplicates = duplicates;
    return this;
  }

  public BusinessAccount addDuplicatesItem(DuplicateDetail duplicatesItem) {
    if (this.duplicates == null) {
      this.duplicates = new ArrayList<>();
    }
    this.duplicates.add(duplicatesItem);
    return this;
  }

   /**
   * Get duplicates
   * @return duplicates
  **/
  @ApiModelProperty(value = "")
  public List<DuplicateDetail> getDuplicates() {
    return duplicates;
  }

  public void setDuplicates(List<DuplicateDetail> duplicates) {
    this.duplicates = duplicates;
  }

  public BusinessAccount lastIncomingActivity(DateTimeValue lastIncomingActivity) {
    this.lastIncomingActivity = lastIncomingActivity;
    return this;
  }

   /**
   * Get lastIncomingActivity
   * @return lastIncomingActivity
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getLastIncomingActivity() {
    return lastIncomingActivity;
  }

  public void setLastIncomingActivity(DateTimeValue lastIncomingActivity) {
    this.lastIncomingActivity = lastIncomingActivity;
  }

  public BusinessAccount lastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * Get lastModifiedDateTime
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(DateTimeValue lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public BusinessAccount lastOutgoingActivity(DateTimeValue lastOutgoingActivity) {
    this.lastOutgoingActivity = lastOutgoingActivity;
    return this;
  }

   /**
   * Get lastOutgoingActivity
   * @return lastOutgoingActivity
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getLastOutgoingActivity() {
    return lastOutgoingActivity;
  }

  public void setLastOutgoingActivity(DateTimeValue lastOutgoingActivity) {
    this.lastOutgoingActivity = lastOutgoingActivity;
  }

  public BusinessAccount locations(List<BusinessAccountLocation> locations) {
    this.locations = locations;
    return this;
  }

  public BusinessAccount addLocationsItem(BusinessAccountLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @ApiModelProperty(value = "")
  public List<BusinessAccountLocation> getLocations() {
    return locations;
  }

  public void setLocations(List<BusinessAccountLocation> locations) {
    this.locations = locations;
  }

  public BusinessAccount mainAddress(Address mainAddress) {
    this.mainAddress = mainAddress;
    return this;
  }

   /**
   * Get mainAddress
   * @return mainAddress
  **/
  @ApiModelProperty(value = "")
  public Address getMainAddress() {
    return mainAddress;
  }

  public void setMainAddress(Address mainAddress) {
    this.mainAddress = mainAddress;
  }

  public BusinessAccount mainAddressValidated(BooleanValue mainAddressValidated) {
    this.mainAddressValidated = mainAddressValidated;
    return this;
  }

   /**
   * Get mainAddressValidated
   * @return mainAddressValidated
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getMainAddressValidated() {
    return mainAddressValidated;
  }

  public void setMainAddressValidated(BooleanValue mainAddressValidated) {
    this.mainAddressValidated = mainAddressValidated;
  }

  public BusinessAccount mainContact(BusinessAccountMainContact mainContact) {
    this.mainContact = mainContact;
    return this;
  }

   /**
   * Get mainContact
   * @return mainContact
  **/
  @ApiModelProperty(value = "")
  public BusinessAccountMainContact getMainContact() {
    return mainContact;
  }

  public void setMainContact(BusinessAccountMainContact mainContact) {
    this.mainContact = mainContact;
  }

  public BusinessAccount marketingLists(List<MarketingListDetail> marketingLists) {
    this.marketingLists = marketingLists;
    return this;
  }

  public BusinessAccount addMarketingListsItem(MarketingListDetail marketingListsItem) {
    if (this.marketingLists == null) {
      this.marketingLists = new ArrayList<>();
    }
    this.marketingLists.add(marketingListsItem);
    return this;
  }

   /**
   * Get marketingLists
   * @return marketingLists
  **/
  @ApiModelProperty(value = "")
  public List<MarketingListDetail> getMarketingLists() {
    return marketingLists;
  }

  public void setMarketingLists(List<MarketingListDetail> marketingLists) {
    this.marketingLists = marketingLists;
  }

  public BusinessAccount name(StringValue name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public StringValue getName() {
    return name;
  }

  public void setName(StringValue name) {
    this.name = name;
  }

  public BusinessAccount opportunities(List<BusinessAccountOpportunityDetail> opportunities) {
    this.opportunities = opportunities;
    return this;
  }

  public BusinessAccount addOpportunitiesItem(BusinessAccountOpportunityDetail opportunitiesItem) {
    if (this.opportunities == null) {
      this.opportunities = new ArrayList<>();
    }
    this.opportunities.add(opportunitiesItem);
    return this;
  }

   /**
   * Get opportunities
   * @return opportunities
  **/
  @ApiModelProperty(value = "")
  public List<BusinessAccountOpportunityDetail> getOpportunities() {
    return opportunities;
  }

  public void setOpportunities(List<BusinessAccountOpportunityDetail> opportunities) {
    this.opportunities = opportunities;
  }

  public BusinessAccount orders(List<BusinessAccountOrder> orders) {
    this.orders = orders;
    return this;
  }

  public BusinessAccount addOrdersItem(BusinessAccountOrder ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @ApiModelProperty(value = "")
  public List<BusinessAccountOrder> getOrders() {
    return orders;
  }

  public void setOrders(List<BusinessAccountOrder> orders) {
    this.orders = orders;
  }

  public BusinessAccount owner(StringValue owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public StringValue getOwner() {
    return owner;
  }

  public void setOwner(StringValue owner) {
    this.owner = owner;
  }

  public BusinessAccount ownerEmployeeName(StringValue ownerEmployeeName) {
    this.ownerEmployeeName = ownerEmployeeName;
    return this;
  }

   /**
   * Get ownerEmployeeName
   * @return ownerEmployeeName
  **/
  @ApiModelProperty(value = "")
  public StringValue getOwnerEmployeeName() {
    return ownerEmployeeName;
  }

  public void setOwnerEmployeeName(StringValue ownerEmployeeName) {
    this.ownerEmployeeName = ownerEmployeeName;
  }

  public BusinessAccount parentAccount(StringValue parentAccount) {
    this.parentAccount = parentAccount;
    return this;
  }

   /**
   * Get parentAccount
   * @return parentAccount
  **/
  @ApiModelProperty(value = "")
  public StringValue getParentAccount() {
    return parentAccount;
  }

  public void setParentAccount(StringValue parentAccount) {
    this.parentAccount = parentAccount;
  }

  public BusinessAccount primaryContact(Contact primaryContact) {
    this.primaryContact = primaryContact;
    return this;
  }

   /**
   * Get primaryContact
   * @return primaryContact
  **/
  @ApiModelProperty(value = "")
  public Contact getPrimaryContact() {
    return primaryContact;
  }

  public void setPrimaryContact(Contact primaryContact) {
    this.primaryContact = primaryContact;
  }

  public BusinessAccount relations(List<RelationDetail> relations) {
    this.relations = relations;
    return this;
  }

  public BusinessAccount addRelationsItem(RelationDetail relationsItem) {
    if (this.relations == null) {
      this.relations = new ArrayList<>();
    }
    this.relations.add(relationsItem);
    return this;
  }

   /**
   * Get relations
   * @return relations
  **/
  @ApiModelProperty(value = "")
  public List<RelationDetail> getRelations() {
    return relations;
  }

  public void setRelations(List<RelationDetail> relations) {
    this.relations = relations;
  }

  public BusinessAccount shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public BusinessAccount shippingAddressOverride(BooleanValue shippingAddressOverride) {
    this.shippingAddressOverride = shippingAddressOverride;
    return this;
  }

   /**
   * Get shippingAddressOverride
   * @return shippingAddressOverride
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getShippingAddressOverride() {
    return shippingAddressOverride;
  }

  public void setShippingAddressOverride(BooleanValue shippingAddressOverride) {
    this.shippingAddressOverride = shippingAddressOverride;
  }

  public BusinessAccount shippingAddressValidated(BooleanValue shippingAddressValidated) {
    this.shippingAddressValidated = shippingAddressValidated;
    return this;
  }

   /**
   * Get shippingAddressValidated
   * @return shippingAddressValidated
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getShippingAddressValidated() {
    return shippingAddressValidated;
  }

  public void setShippingAddressValidated(BooleanValue shippingAddressValidated) {
    this.shippingAddressValidated = shippingAddressValidated;
  }

  public BusinessAccount shippingContact(BusinessAccountShippingContact shippingContact) {
    this.shippingContact = shippingContact;
    return this;
  }

   /**
   * Get shippingContact
   * @return shippingContact
  **/
  @ApiModelProperty(value = "")
  public BusinessAccountShippingContact getShippingContact() {
    return shippingContact;
  }

  public void setShippingContact(BusinessAccountShippingContact shippingContact) {
    this.shippingContact = shippingContact;
  }

  public BusinessAccount sourceCampaign(StringValue sourceCampaign) {
    this.sourceCampaign = sourceCampaign;
    return this;
  }

   /**
   * Get sourceCampaign
   * @return sourceCampaign
  **/
  @ApiModelProperty(value = "")
  public StringValue getSourceCampaign() {
    return sourceCampaign;
  }

  public void setSourceCampaign(StringValue sourceCampaign) {
    this.sourceCampaign = sourceCampaign;
  }

  public BusinessAccount status(StringValue status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StringValue getStatus() {
    return status;
  }

  public void setStatus(StringValue status) {
    this.status = status;
  }

  public BusinessAccount type(StringValue type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public StringValue getType() {
    return type;
  }

  public void setType(StringValue type) {
    this.type = type;
  }

  public BusinessAccount workgroup(StringValue workgroup) {
    this.workgroup = workgroup;
    return this;
  }

   /**
   * Get workgroup
   * @return workgroup
  **/
  @ApiModelProperty(value = "")
  public StringValue getWorkgroup() {
    return workgroup;
  }

  public void setWorkgroup(StringValue workgroup) {
    this.workgroup = workgroup;
  }

  public BusinessAccount workgroupDescription(StringValue workgroupDescription) {
    this.workgroupDescription = workgroupDescription;
    return this;
  }

   /**
   * Get workgroupDescription
   * @return workgroupDescription
  **/
  @ApiModelProperty(value = "")
  public StringValue getWorkgroupDescription() {
    return workgroupDescription;
  }

  public void setWorkgroupDescription(StringValue workgroupDescription) {
    this.workgroupDescription = workgroupDescription;
  }

  public BusinessAccount noteID(GuidValue noteID) {
    this.noteID = noteID;
    return this;
  }

   /**
   * Get noteID
   * @return noteID
  **/
  @ApiModelProperty(value = "")
  public GuidValue getNoteID() {
    return noteID;
  }

  public void setNoteID(GuidValue noteID) {
    this.noteID = noteID;
  }

}

