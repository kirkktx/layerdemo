////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by FernFlower decompiler)
////
//
//package org.openapitools.model;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import java.io.Serializable;
//import java.util.Objects;
//import javax.validation.constraints.NotNull;
//
//@ApiModel(
//        description = "A layer *Data Transfer Object* (**DTO**) representing a layer to be investigated for potential loading into Pivot "
//)
//public class LayerDto implements Serializable {
//    private static final long serialVersionUID = 1L;
//    @JsonProperty("id")
//    private Long id = 44L;
//    @JsonProperty("shortName")
//    private String shortName;
//    @JsonProperty("longName")
//    private String longName;
//    @JsonProperty("description")
//    private String description;
//    @JsonProperty("steward")
//    private String steward;
//    @JsonProperty("sourceLayer")
//    private String sourceLayer;
//    @JsonProperty("sourceLocation")
//    private String sourceLocation;
//    @JsonProperty("cloudvaultLocation")
//    private String cloudvaultLocation;
//    @JsonProperty("maclocation")
//    private String maclocation;
//    @JsonProperty("oracletable")
//    private String oracletable;
//    @JsonProperty("fileName")
//    private String fileName;
//    @JsonProperty("fileSize")
//    private String fileSize;
//    @JsonProperty("docreqs")
//    private String docreqs;
//    @JsonProperty("goal")
//    private String goal;
//    @JsonProperty("numberofrecords")
//    private Long numberofrecords = 9877L;
//    @JsonProperty("numberofcolumns")
//    private Long numberofcolumns = 23L;
//    @JsonProperty("dataelements")
//    private Long dataelements = 34L;
//    @JsonProperty("approvalPtapia")
//    private String approvalPtapia;
//    @JsonProperty("approvalIsso")
//    private String approvalIsso;
//
//    public LayerDto() {
//    }
//
//    public LayerDto id(Long id) {
//        this.id = id;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "43",
//            required = true,
//            value = ""
//    )
//    @NotNull
//    public Long getId() {
//        return this.id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public LayerDto shortName(String shortName) {
//        this.shortName = shortName;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "ORNL",
//            required = true,
//            value = "typically the same as the schema name in the database, similar to how Jira uses short name for projects (like NFIPG) "
//    )
//    @NotNull
//    public String getShortName() {
//        return this.shortName;
//    }
//
//    public void setShortName(String shortName) {
//        this.shortName = shortName;
//    }
//
//    public LayerDto longName(String longName) {
//        this.longName = longName;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "ORNL building footprints",
//            value = ""
//    )
//    public String getLongName() {
//        return this.longName;
//    }
//
//    public void setLongName(String longName) {
//        this.longName = longName;
//    }
//
//    public LayerDto description(String description) {
//        this.description = description;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "building footprints from various sources curated by ORNL",
//            value = ""
//    )
//    public String getDescription() {
//        return this.description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public LayerDto steward(String steward) {
//        this.steward = steward;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "IADP",
//            value = ""
//    )
//    public String getSteward() {
//        return this.steward;
//    }
//
//    public void setSteward(String steward) {
//        this.steward = steward;
//    }
//
//    public LayerDto sourceLayer(String sourceLayer) {
//        this.sourceLayer = sourceLayer;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "todo what does this mean?",
//            value = ""
//    )
//    public String getSourceLayer() {
//        return this.sourceLayer;
//    }
//
//    public void setSourceLayer(String sourceLayer) {
//        this.sourceLayer = sourceLayer;
//    }
//
//    public LayerDto sourceLocation(String sourceLocation) {
//        this.sourceLocation = sourceLocation;
//        return this;
//    }
//
//    @ApiModelProperty("")
//    public String getSourceLocation() {
//        return this.sourceLocation;
//    }
//
//    public void setSourceLocation(String sourceLocation) {
//        this.sourceLocation = sourceLocation;
//    }
//
//    public LayerDto cloudvaultLocation(String cloudvaultLocation) {
//        this.cloudvaultLocation = cloudvaultLocation;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "http://someurlto/afolder/in/cloudvault",
//            value = ""
//    )
//    public String getCloudvaultLocation() {
//        return this.cloudvaultLocation;
//    }
//
//    public void setCloudvaultLocation(String cloudvaultLocation) {
//        this.cloudvaultLocation = cloudvaultLocation;
//    }
//
//    public LayerDto maclocation(String maclocation) {
//        this.maclocation = maclocation;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "todo: a UNC path on FEMA network?",
//            value = ""
//    )
//    public String getMaclocation() {
//        return this.maclocation;
//    }
//
//    public void setMaclocation(String maclocation) {
//        this.maclocation = maclocation;
//    }
//
//    public LayerDto oracletable(String oracletable) {
//        this.oracletable = oracletable;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "someserver.someschema.sometable",
//            value = ""
//    )
//    public String getOracletable() {
//        return this.oracletable;
//    }
//
//    public void setOracletable(String oracletable) {
//        this.oracletable = oracletable;
//    }
//
//    public LayerDto fileName(String fileName) {
//        this.fileName = fileName;
//        return this;
//    }
//
//    @ApiModelProperty("")
//    public String getFileName() {
//        return this.fileName;
//    }
//
//    public void setFileName(String fileName) {
//        this.fileName = fileName;
//    }
//
//    public LayerDto fileSize(String fileSize) {
//        this.fileSize = fileSize;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "123 GB",
//            value = ""
//    )
//    public String getFileSize() {
//        return this.fileSize;
//    }
//
//    public void setFileSize(String fileSize) {
//        this.fileSize = fileSize;
//    }
//
//    public LayerDto docreqs(String docreqs) {
//        this.docreqs = docreqs;
//        return this;
//    }
//
//    @ApiModelProperty("documentation requirements")
//    public String getDocreqs() {
//        return this.docreqs;
//    }
//
//    public void setDocreqs(String docreqs) {
//        this.docreqs = docreqs;
//    }
//
//    public LayerDto goal(String goal) {
//        this.goal = goal;
//        return this;
//    }
//
//    @ApiModelProperty("Geospatial goal application/ Question#")
//    public String getGoal() {
//        return this.goal;
//    }
//
//    public void setGoal(String goal) {
//        this.goal = goal;
//    }
//
//    public LayerDto numberofrecords(Long numberofrecords) {
//        this.numberofrecords = numberofrecords;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "9876",
//            value = ""
//    )
//    public Long getNumberofrecords() {
//        return this.numberofrecords;
//    }
//
//    public void setNumberofrecords(Long numberofrecords) {
//        this.numberofrecords = numberofrecords;
//    }
//
//    public LayerDto numberofcolumns(Long numberofcolumns) {
//        this.numberofcolumns = numberofcolumns;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "22",
//            value = ""
//    )
//    public Long getNumberofcolumns() {
//        return this.numberofcolumns;
//    }
//
//    public void setNumberofcolumns(Long numberofcolumns) {
//        this.numberofcolumns = numberofcolumns;
//    }
//
//    public LayerDto dataelements(Long dataelements) {
//        this.dataelements = dataelements;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "33",
//            value = ""
//    )
//    public Long getDataelements() {
//        return this.dataelements;
//    }
//
//    public void setDataelements(Long dataelements) {
//        this.dataelements = dataelements;
//    }
//
//    public LayerDto approvalPtapia(String approvalPtapia) {
//        this.approvalPtapia = approvalPtapia;
//        return this;
//    }
//
//    @ApiModelProperty(
//            example = "todo: an example",
//            value = "PTA/PIA updated and approved"
//    )
//    public String getApprovalPtapia() {
//        return this.approvalPtapia;
//    }
//
//    public void setApprovalPtapia(String approvalPtapia) {
//        this.approvalPtapia = approvalPtapia;
//    }
//
//    public LayerDto approvalIsso(String approvalIsso) {
//        this.approvalIsso = approvalIsso;
//        return this;
//    }
//
//    @ApiModelProperty("Approval from ISSO and System Owner for use in Beta / Prod environments (Link Jira Ticket)")
//    public String getApprovalIsso() {
//        return this.approvalIsso;
//    }
//
//    public void setApprovalIsso(String approvalIsso) {
//        this.approvalIsso = approvalIsso;
//    }
//
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        } else if (o != null && this.getClass() == o.getClass()) {
//            LayerDto layerDto = (LayerDto)o;
//            return Objects.equals(this.id, layerDto.id) && Objects.equals(this.shortName, layerDto.shortName) && Objects.equals(this.longName, layerDto.longName) && Objects.equals(this.description, layerDto.description) && Objects.equals(this.steward, layerDto.steward) && Objects.equals(this.sourceLayer, layerDto.sourceLayer) && Objects.equals(this.sourceLocation, layerDto.sourceLocation) && Objects.equals(this.cloudvaultLocation, layerDto.cloudvaultLocation) && Objects.equals(this.maclocation, layerDto.maclocation) && Objects.equals(this.oracletable, layerDto.oracletable) && Objects.equals(this.fileName, layerDto.fileName) && Objects.equals(this.fileSize, layerDto.fileSize) && Objects.equals(this.docreqs, layerDto.docreqs) && Objects.equals(this.goal, layerDto.goal) && Objects.equals(this.numberofrecords, layerDto.numberofrecords) && Objects.equals(this.numberofcolumns, layerDto.numberofcolumns) && Objects.equals(this.dataelements, layerDto.dataelements) && Objects.equals(this.approvalPtapia, layerDto.approvalPtapia) && Objects.equals(this.approvalIsso, layerDto.approvalIsso);
//        } else {
//            return false;
//        }
//    }
//
//    public int hashCode() {
//        return Objects.hash(new Object[]{this.id, this.shortName, this.longName, this.description, this.steward, this.sourceLayer, this.sourceLocation, this.cloudvaultLocation, this.maclocation, this.oracletable, this.fileName, this.fileSize, this.docreqs, this.goal, this.numberofrecords, this.numberofcolumns, this.dataelements, this.approvalPtapia, this.approvalIsso});
//    }
//
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("class LayerDto {\n");
//        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
//        sb.append("    shortName: ").append(this.toIndentedString(this.shortName)).append("\n");
//        sb.append("    longName: ").append(this.toIndentedString(this.longName)).append("\n");
//        sb.append("    description: ").append(this.toIndentedString(this.description)).append("\n");
//        sb.append("    steward: ").append(this.toIndentedString(this.steward)).append("\n");
//        sb.append("    sourceLayer: ").append(this.toIndentedString(this.sourceLayer)).append("\n");
//        sb.append("    sourceLocation: ").append(this.toIndentedString(this.sourceLocation)).append("\n");
//        sb.append("    cloudvaultLocation: ").append(this.toIndentedString(this.cloudvaultLocation)).append("\n");
//        sb.append("    maclocation: ").append(this.toIndentedString(this.maclocation)).append("\n");
//        sb.append("    oracletable: ").append(this.toIndentedString(this.oracletable)).append("\n");
//        sb.append("    fileName: ").append(this.toIndentedString(this.fileName)).append("\n");
//        sb.append("    fileSize: ").append(this.toIndentedString(this.fileSize)).append("\n");
//        sb.append("    docreqs: ").append(this.toIndentedString(this.docreqs)).append("\n");
//        sb.append("    goal: ").append(this.toIndentedString(this.goal)).append("\n");
//        sb.append("    numberofrecords: ").append(this.toIndentedString(this.numberofrecords)).append("\n");
//        sb.append("    numberofcolumns: ").append(this.toIndentedString(this.numberofcolumns)).append("\n");
//        sb.append("    dataelements: ").append(this.toIndentedString(this.dataelements)).append("\n");
//        sb.append("    approvalPtapia: ").append(this.toIndentedString(this.approvalPtapia)).append("\n");
//        sb.append("    approvalIsso: ").append(this.toIndentedString(this.approvalIsso)).append("\n");
//        sb.append("}");
//        return sb.toString();
//    }
//
//    private String toIndentedString(Object o) {
//        return o == null ? "null" : o.toString().replace("\n", "\n    ");
//    }
//}
