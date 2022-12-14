/*
 * Default/22.200.001
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import model.AttributeValue;
import model.BooleanValue;
import model.CategoryStockItem;
import model.CustomField;
import model.DateTimeValue;
import model.DecimalValue;
import model.Entity;
import model.FileLink;
import model.InventoryFileUrls;
import model.MatrixItems;
import model.StringValue;
import model.TemplateItemVendorDetail;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * TemplateItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:29:48.617Z")
public class TemplateItems extends Entity {
  @SerializedName("SalesUOM")
  private StringValue salesUOM = null;

  @SerializedName("CurySpecificMSRP")
  private DecimalValue curySpecificMSRP = null;

  @SerializedName("CurySpecificPrice")
  private DecimalValue curySpecificPrice = null;

  @SerializedName("ItemClass")
  private StringValue itemClass = null;

  @SerializedName("Availability")
  private StringValue availability = null;

  @SerializedName("Attributes")
  private List<AttributeValue> attributes = null;

  @SerializedName("BaseUOM")
  private StringValue baseUOM = null;

  @SerializedName("Categories")
  private List<CategoryStockItem> categories = null;

  @SerializedName("Content")
  private StringValue content = null;

  @SerializedName("CurrentStdCost")
  private DecimalValue currentStdCost = null;

  @SerializedName("CustomURL")
  private StringValue customURL = null;

  @SerializedName("DefaultIssueLocationID")
  private StringValue defaultIssueLocationID = null;

  @SerializedName("DefaultPrice")
  private DecimalValue defaultPrice = null;

  @SerializedName("Description")
  private StringValue description = null;

  @SerializedName("DimensionWeight")
  private DecimalValue dimensionWeight = null;

  @SerializedName("ExportToExternal")
  private BooleanValue exportToExternal = null;

  @SerializedName("FileURLs")
  private List<InventoryFileUrls> fileURLs = null;

  @SerializedName("InventoryID")
  private StringValue inventoryID = null;

  @SerializedName("IsStockItem")
  private BooleanValue isStockItem = null;

  @SerializedName("ItemStatus")
  private StringValue itemStatus = null;

  @SerializedName("LastModified")
  private DateTimeValue lastModified = null;

  @SerializedName("Matrix")
  private List<MatrixItems> matrix = null;

  @SerializedName("MetaDescription")
  private StringValue metaDescription = null;

  @SerializedName("MSRP")
  private DecimalValue MSRP = null;

  @SerializedName("PageTitle")
  private StringValue pageTitle = null;

  @SerializedName("SearchKeywords")
  private StringValue searchKeywords = null;

  @SerializedName("TaxCategory")
  private StringValue taxCategory = null;

  @SerializedName("Visibility")
  private StringValue visibility = null;

  @SerializedName("WeightUOM")
  private StringValue weightUOM = null;

  @SerializedName("MetaKeywords")
  private StringValue metaKeywords = null;

  @SerializedName("RequireShipment")
  private BooleanValue requireShipment = null;

  @SerializedName("NotAvailable")
  private StringValue notAvailable = null;

  @SerializedName("VendorDetails")
  private List<TemplateItemVendorDetail> vendorDetails = null;

  public TemplateItems salesUOM(StringValue salesUOM) {
    this.salesUOM = salesUOM;
    return this;
  }

   /**
   * Get salesUOM
   * @return salesUOM
  **/
  @ApiModelProperty(value = "")
  public StringValue getSalesUOM() {
    return salesUOM;
  }

  public void setSalesUOM(StringValue salesUOM) {
    this.salesUOM = salesUOM;
  }

  public TemplateItems curySpecificMSRP(DecimalValue curySpecificMSRP) {
    this.curySpecificMSRP = curySpecificMSRP;
    return this;
  }

   /**
   * Get curySpecificMSRP
   * @return curySpecificMSRP
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCurySpecificMSRP() {
    return curySpecificMSRP;
  }

  public void setCurySpecificMSRP(DecimalValue curySpecificMSRP) {
    this.curySpecificMSRP = curySpecificMSRP;
  }

  public TemplateItems curySpecificPrice(DecimalValue curySpecificPrice) {
    this.curySpecificPrice = curySpecificPrice;
    return this;
  }

   /**
   * Get curySpecificPrice
   * @return curySpecificPrice
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCurySpecificPrice() {
    return curySpecificPrice;
  }

  public void setCurySpecificPrice(DecimalValue curySpecificPrice) {
    this.curySpecificPrice = curySpecificPrice;
  }

  public TemplateItems itemClass(StringValue itemClass) {
    this.itemClass = itemClass;
    return this;
  }

   /**
   * Get itemClass
   * @return itemClass
  **/
  @ApiModelProperty(value = "")
  public StringValue getItemClass() {
    return itemClass;
  }

  public void setItemClass(StringValue itemClass) {
    this.itemClass = itemClass;
  }

  public TemplateItems availability(StringValue availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(value = "")
  public StringValue getAvailability() {
    return availability;
  }

  public void setAvailability(StringValue availability) {
    this.availability = availability;
  }

  public TemplateItems attributes(List<AttributeValue> attributes) {
    this.attributes = attributes;
    return this;
  }

  public TemplateItems addAttributesItem(AttributeValue attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<AttributeValue>();
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

  public TemplateItems baseUOM(StringValue baseUOM) {
    this.baseUOM = baseUOM;
    return this;
  }

   /**
   * Get baseUOM
   * @return baseUOM
  **/
  @ApiModelProperty(value = "")
  public StringValue getBaseUOM() {
    return baseUOM;
  }

  public void setBaseUOM(StringValue baseUOM) {
    this.baseUOM = baseUOM;
  }

  public TemplateItems categories(List<CategoryStockItem> categories) {
    this.categories = categories;
    return this;
  }

  public TemplateItems addCategoriesItem(CategoryStockItem categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<CategoryStockItem>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @ApiModelProperty(value = "")
  public List<CategoryStockItem> getCategories() {
    return categories;
  }

  public void setCategories(List<CategoryStockItem> categories) {
    this.categories = categories;
  }

  public TemplateItems content(StringValue content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public StringValue getContent() {
    return content;
  }

  public void setContent(StringValue content) {
    this.content = content;
  }

  public TemplateItems currentStdCost(DecimalValue currentStdCost) {
    this.currentStdCost = currentStdCost;
    return this;
  }

   /**
   * Get currentStdCost
   * @return currentStdCost
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getCurrentStdCost() {
    return currentStdCost;
  }

  public void setCurrentStdCost(DecimalValue currentStdCost) {
    this.currentStdCost = currentStdCost;
  }

  public TemplateItems customURL(StringValue customURL) {
    this.customURL = customURL;
    return this;
  }

   /**
   * Get customURL
   * @return customURL
  **/
  @ApiModelProperty(value = "")
  public StringValue getCustomURL() {
    return customURL;
  }

  public void setCustomURL(StringValue customURL) {
    this.customURL = customURL;
  }

  public TemplateItems defaultIssueLocationID(StringValue defaultIssueLocationID) {
    this.defaultIssueLocationID = defaultIssueLocationID;
    return this;
  }

   /**
   * Get defaultIssueLocationID
   * @return defaultIssueLocationID
  **/
  @ApiModelProperty(value = "")
  public StringValue getDefaultIssueLocationID() {
    return defaultIssueLocationID;
  }

  public void setDefaultIssueLocationID(StringValue defaultIssueLocationID) {
    this.defaultIssueLocationID = defaultIssueLocationID;
  }

  public TemplateItems defaultPrice(DecimalValue defaultPrice) {
    this.defaultPrice = defaultPrice;
    return this;
  }

   /**
   * Get defaultPrice
   * @return defaultPrice
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDefaultPrice() {
    return defaultPrice;
  }

  public void setDefaultPrice(DecimalValue defaultPrice) {
    this.defaultPrice = defaultPrice;
  }

  public TemplateItems description(StringValue description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public StringValue getDescription() {
    return description;
  }

  public void setDescription(StringValue description) {
    this.description = description;
  }

  public TemplateItems dimensionWeight(DecimalValue dimensionWeight) {
    this.dimensionWeight = dimensionWeight;
    return this;
  }

   /**
   * Get dimensionWeight
   * @return dimensionWeight
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getDimensionWeight() {
    return dimensionWeight;
  }

  public void setDimensionWeight(DecimalValue dimensionWeight) {
    this.dimensionWeight = dimensionWeight;
  }

  public TemplateItems exportToExternal(BooleanValue exportToExternal) {
    this.exportToExternal = exportToExternal;
    return this;
  }

   /**
   * Get exportToExternal
   * @return exportToExternal
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getExportToExternal() {
    return exportToExternal;
  }

  public void setExportToExternal(BooleanValue exportToExternal) {
    this.exportToExternal = exportToExternal;
  }

  public TemplateItems fileURLs(List<InventoryFileUrls> fileURLs) {
    this.fileURLs = fileURLs;
    return this;
  }

  public TemplateItems addFileURLsItem(InventoryFileUrls fileURLsItem) {
    if (this.fileURLs == null) {
      this.fileURLs = new ArrayList<InventoryFileUrls>();
    }
    this.fileURLs.add(fileURLsItem);
    return this;
  }

   /**
   * Get fileURLs
   * @return fileURLs
  **/
  @ApiModelProperty(value = "")
  public List<InventoryFileUrls> getFileURLs() {
    return fileURLs;
  }

  public void setFileURLs(List<InventoryFileUrls> fileURLs) {
    this.fileURLs = fileURLs;
  }

  public TemplateItems inventoryID(StringValue inventoryID) {
    this.inventoryID = inventoryID;
    return this;
  }

   /**
   * Get inventoryID
   * @return inventoryID
  **/
  @ApiModelProperty(value = "")
  public StringValue getInventoryID() {
    return inventoryID;
  }

  public void setInventoryID(StringValue inventoryID) {
    this.inventoryID = inventoryID;
  }

  public TemplateItems isStockItem(BooleanValue isStockItem) {
    this.isStockItem = isStockItem;
    return this;
  }

   /**
   * Get isStockItem
   * @return isStockItem
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getIsStockItem() {
    return isStockItem;
  }

  public void setIsStockItem(BooleanValue isStockItem) {
    this.isStockItem = isStockItem;
  }

  public TemplateItems itemStatus(StringValue itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * Get itemStatus
   * @return itemStatus
  **/
  @ApiModelProperty(value = "")
  public StringValue getItemStatus() {
    return itemStatus;
  }

  public void setItemStatus(StringValue itemStatus) {
    this.itemStatus = itemStatus;
  }

  public TemplateItems lastModified(DateTimeValue lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public DateTimeValue getLastModified() {
    return lastModified;
  }

  public void setLastModified(DateTimeValue lastModified) {
    this.lastModified = lastModified;
  }

  public TemplateItems matrix(List<MatrixItems> matrix) {
    this.matrix = matrix;
    return this;
  }

  public TemplateItems addMatrixItem(MatrixItems matrixItem) {
    if (this.matrix == null) {
      this.matrix = new ArrayList<MatrixItems>();
    }
    this.matrix.add(matrixItem);
    return this;
  }

   /**
   * Get matrix
   * @return matrix
  **/
  @ApiModelProperty(value = "")
  public List<MatrixItems> getMatrix() {
    return matrix;
  }

  public void setMatrix(List<MatrixItems> matrix) {
    this.matrix = matrix;
  }

  public TemplateItems metaDescription(StringValue metaDescription) {
    this.metaDescription = metaDescription;
    return this;
  }

   /**
   * Get metaDescription
   * @return metaDescription
  **/
  @ApiModelProperty(value = "")
  public StringValue getMetaDescription() {
    return metaDescription;
  }

  public void setMetaDescription(StringValue metaDescription) {
    this.metaDescription = metaDescription;
  }

  public TemplateItems MSRP(DecimalValue MSRP) {
    this.MSRP = MSRP;
    return this;
  }

   /**
   * Get MSRP
   * @return MSRP
  **/
  @ApiModelProperty(value = "")
  public DecimalValue getMSRP() {
    return MSRP;
  }

  public void setMSRP(DecimalValue MSRP) {
    this.MSRP = MSRP;
  }

  public TemplateItems pageTitle(StringValue pageTitle) {
    this.pageTitle = pageTitle;
    return this;
  }

   /**
   * Get pageTitle
   * @return pageTitle
  **/
  @ApiModelProperty(value = "")
  public StringValue getPageTitle() {
    return pageTitle;
  }

  public void setPageTitle(StringValue pageTitle) {
    this.pageTitle = pageTitle;
  }

  public TemplateItems searchKeywords(StringValue searchKeywords) {
    this.searchKeywords = searchKeywords;
    return this;
  }

   /**
   * Get searchKeywords
   * @return searchKeywords
  **/
  @ApiModelProperty(value = "")
  public StringValue getSearchKeywords() {
    return searchKeywords;
  }

  public void setSearchKeywords(StringValue searchKeywords) {
    this.searchKeywords = searchKeywords;
  }

  public TemplateItems taxCategory(StringValue taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

   /**
   * Get taxCategory
   * @return taxCategory
  **/
  @ApiModelProperty(value = "")
  public StringValue getTaxCategory() {
    return taxCategory;
  }

  public void setTaxCategory(StringValue taxCategory) {
    this.taxCategory = taxCategory;
  }

  public TemplateItems visibility(StringValue visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @ApiModelProperty(value = "")
  public StringValue getVisibility() {
    return visibility;
  }

  public void setVisibility(StringValue visibility) {
    this.visibility = visibility;
  }

  public TemplateItems weightUOM(StringValue weightUOM) {
    this.weightUOM = weightUOM;
    return this;
  }

   /**
   * Get weightUOM
   * @return weightUOM
  **/
  @ApiModelProperty(value = "")
  public StringValue getWeightUOM() {
    return weightUOM;
  }

  public void setWeightUOM(StringValue weightUOM) {
    this.weightUOM = weightUOM;
  }

  public TemplateItems metaKeywords(StringValue metaKeywords) {
    this.metaKeywords = metaKeywords;
    return this;
  }

   /**
   * Get metaKeywords
   * @return metaKeywords
  **/
  @ApiModelProperty(value = "")
  public StringValue getMetaKeywords() {
    return metaKeywords;
  }

  public void setMetaKeywords(StringValue metaKeywords) {
    this.metaKeywords = metaKeywords;
  }

  public TemplateItems requireShipment(BooleanValue requireShipment) {
    this.requireShipment = requireShipment;
    return this;
  }

   /**
   * Get requireShipment
   * @return requireShipment
  **/
  @ApiModelProperty(value = "")
  public BooleanValue getRequireShipment() {
    return requireShipment;
  }

  public void setRequireShipment(BooleanValue requireShipment) {
    this.requireShipment = requireShipment;
  }

  public TemplateItems notAvailable(StringValue notAvailable) {
    this.notAvailable = notAvailable;
    return this;
  }

   /**
   * Get notAvailable
   * @return notAvailable
  **/
  @ApiModelProperty(value = "")
  public StringValue getNotAvailable() {
    return notAvailable;
  }

  public void setNotAvailable(StringValue notAvailable) {
    this.notAvailable = notAvailable;
  }

  public TemplateItems vendorDetails(List<TemplateItemVendorDetail> vendorDetails) {
    this.vendorDetails = vendorDetails;
    return this;
  }

  public TemplateItems addVendorDetailsItem(TemplateItemVendorDetail vendorDetailsItem) {
    if (this.vendorDetails == null) {
      this.vendorDetails = new ArrayList<TemplateItemVendorDetail>();
    }
    this.vendorDetails.add(vendorDetailsItem);
    return this;
  }

   /**
   * Get vendorDetails
   * @return vendorDetails
  **/
  @ApiModelProperty(value = "")
  public List<TemplateItemVendorDetail> getVendorDetails() {
    return vendorDetails;
  }

  public void setVendorDetails(List<TemplateItemVendorDetail> vendorDetails) {
    this.vendorDetails = vendorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateItems templateItems = (TemplateItems) o;
    return Objects.equals(this.salesUOM, templateItems.salesUOM) &&
        Objects.equals(this.curySpecificMSRP, templateItems.curySpecificMSRP) &&
        Objects.equals(this.curySpecificPrice, templateItems.curySpecificPrice) &&
        Objects.equals(this.itemClass, templateItems.itemClass) &&
        Objects.equals(this.availability, templateItems.availability) &&
        Objects.equals(this.attributes, templateItems.attributes) &&
        Objects.equals(this.baseUOM, templateItems.baseUOM) &&
        Objects.equals(this.categories, templateItems.categories) &&
        Objects.equals(this.content, templateItems.content) &&
        Objects.equals(this.currentStdCost, templateItems.currentStdCost) &&
        Objects.equals(this.customURL, templateItems.customURL) &&
        Objects.equals(this.defaultIssueLocationID, templateItems.defaultIssueLocationID) &&
        Objects.equals(this.defaultPrice, templateItems.defaultPrice) &&
        Objects.equals(this.description, templateItems.description) &&
        Objects.equals(this.dimensionWeight, templateItems.dimensionWeight) &&
        Objects.equals(this.exportToExternal, templateItems.exportToExternal) &&
        Objects.equals(this.fileURLs, templateItems.fileURLs) &&
        Objects.equals(this.inventoryID, templateItems.inventoryID) &&
        Objects.equals(this.isStockItem, templateItems.isStockItem) &&
        Objects.equals(this.itemStatus, templateItems.itemStatus) &&
        Objects.equals(this.lastModified, templateItems.lastModified) &&
        Objects.equals(this.matrix, templateItems.matrix) &&
        Objects.equals(this.metaDescription, templateItems.metaDescription) &&
        Objects.equals(this.MSRP, templateItems.MSRP) &&
        Objects.equals(this.pageTitle, templateItems.pageTitle) &&
        Objects.equals(this.searchKeywords, templateItems.searchKeywords) &&
        Objects.equals(this.taxCategory, templateItems.taxCategory) &&
        Objects.equals(this.visibility, templateItems.visibility) &&
        Objects.equals(this.weightUOM, templateItems.weightUOM) &&
        Objects.equals(this.metaKeywords, templateItems.metaKeywords) &&
        Objects.equals(this.requireShipment, templateItems.requireShipment) &&
        Objects.equals(this.notAvailable, templateItems.notAvailable) &&
        Objects.equals(this.vendorDetails, templateItems.vendorDetails) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesUOM, curySpecificMSRP, curySpecificPrice, itemClass, availability, attributes, baseUOM, categories, content, currentStdCost, customURL, defaultIssueLocationID, defaultPrice, description, dimensionWeight, exportToExternal, fileURLs, inventoryID, isStockItem, itemStatus, lastModified, matrix, metaDescription, MSRP, pageTitle, searchKeywords, taxCategory, visibility, weightUOM, metaKeywords, requireShipment, notAvailable, vendorDetails, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateItems {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    salesUOM: ").append(toIndentedString(salesUOM)).append("\n");
    sb.append("    curySpecificMSRP: ").append(toIndentedString(curySpecificMSRP)).append("\n");
    sb.append("    curySpecificPrice: ").append(toIndentedString(curySpecificPrice)).append("\n");
    sb.append("    itemClass: ").append(toIndentedString(itemClass)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    baseUOM: ").append(toIndentedString(baseUOM)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    currentStdCost: ").append(toIndentedString(currentStdCost)).append("\n");
    sb.append("    customURL: ").append(toIndentedString(customURL)).append("\n");
    sb.append("    defaultIssueLocationID: ").append(toIndentedString(defaultIssueLocationID)).append("\n");
    sb.append("    defaultPrice: ").append(toIndentedString(defaultPrice)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dimensionWeight: ").append(toIndentedString(dimensionWeight)).append("\n");
    sb.append("    exportToExternal: ").append(toIndentedString(exportToExternal)).append("\n");
    sb.append("    fileURLs: ").append(toIndentedString(fileURLs)).append("\n");
    sb.append("    inventoryID: ").append(toIndentedString(inventoryID)).append("\n");
    sb.append("    isStockItem: ").append(toIndentedString(isStockItem)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    matrix: ").append(toIndentedString(matrix)).append("\n");
    sb.append("    metaDescription: ").append(toIndentedString(metaDescription)).append("\n");
    sb.append("    MSRP: ").append(toIndentedString(MSRP)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    searchKeywords: ").append(toIndentedString(searchKeywords)).append("\n");
    sb.append("    taxCategory: ").append(toIndentedString(taxCategory)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    weightUOM: ").append(toIndentedString(weightUOM)).append("\n");
    sb.append("    metaKeywords: ").append(toIndentedString(metaKeywords)).append("\n");
    sb.append("    requireShipment: ").append(toIndentedString(requireShipment)).append("\n");
    sb.append("    notAvailable: ").append(toIndentedString(notAvailable)).append("\n");
    sb.append("    vendorDetails: ").append(toIndentedString(vendorDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

