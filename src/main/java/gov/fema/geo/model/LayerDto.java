package gov.fema.geo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A layer *Data Transfer Object* (**DTO**) representing a layer to be investigated for potential loading into Pivot
 */
@ApiModel(description = "A layer *Data Transfer Object* (**DTO**) representing a layer to be investigated for potential loading into Pivot ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-20T22:19:44.825487-06:00[America/Denver]")
public class LayerDto  implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Long id = 44l;

    @JsonProperty("shortName")
    private String shortName;

    @JsonProperty("longName")
    private String longName;

    @JsonProperty("description")
    private String description;

    @JsonProperty("steward")
    private String steward;

    @JsonProperty("sourceLayer")
    private String sourceLayer;

    @JsonProperty("sourceLocation")
    private String sourceLocation;

    @JsonProperty("cloudvaultLocation")
    private String cloudvaultLocation;

    @JsonProperty("maclocation")
    private String maclocation;

    @JsonProperty("oracletable")
    private String oracletable;

    @JsonProperty("fileName")
    private String fileName;

    @JsonProperty("fileSize")
    private String fileSize;

    @JsonProperty("docreqs")
    private String docreqs;

    @JsonProperty("goal")
    private String goal;

    @JsonProperty("numberofrecords")
    private Long numberofrecords = 9877l;

    @JsonProperty("numberofcolumns")
    private Long numberofcolumns = 23l;

    @JsonProperty("dataelements")
    private Long dataelements = 34l;

    @JsonProperty("approvalPtapia")
    private String approvalPtapia;

    @JsonProperty("approvalIsso")
    private String approvalIsso;

    public LayerDto id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @ApiModelProperty(example = "43", required = true, value = "")
    @NotNull


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LayerDto shortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * typically the same as the schema name in the database, similar to how Jira uses short name for projects (like NFIPG)
     * @return shortName
     */
    @ApiModelProperty(example = "ORNL", required = true, value = "typically the same as the schema name in the database, similar to how Jira uses short name for projects (like NFIPG) ")
    @NotNull


    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public LayerDto longName(String longName) {
        this.longName = longName;
        return this;
    }

    /**
     * Get longName
     * @return longName
     */
    @ApiModelProperty(example = "ORNL building footprints", value = "")


    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public LayerDto description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @ApiModelProperty(example = "building footprints from various sources curated by ORNL", value = "")


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LayerDto steward(String steward) {
        this.steward = steward;
        return this;
    }

    /**
     * Get steward
     * @return steward
     */
    @ApiModelProperty(example = "IADP", value = "")


    public String getSteward() {
        return steward;
    }

    public void setSteward(String steward) {
        this.steward = steward;
    }

    public LayerDto sourceLayer(String sourceLayer) {
        this.sourceLayer = sourceLayer;
        return this;
    }

    /**
     * Get sourceLayer
     * @return sourceLayer
     */
    @ApiModelProperty(example = "todo what does this mean?", value = "")


    public String getSourceLayer() {
        return sourceLayer;
    }

    public void setSourceLayer(String sourceLayer) {
        this.sourceLayer = sourceLayer;
    }

    public LayerDto sourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }

    /**
     * Get sourceLocation
     * @return sourceLocation
     */
    @ApiModelProperty(value = "")


    public String getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public LayerDto cloudvaultLocation(String cloudvaultLocation) {
        this.cloudvaultLocation = cloudvaultLocation;
        return this;
    }

    /**
     * Get cloudvaultLocation
     * @return cloudvaultLocation
     */
    @ApiModelProperty(example = "http://someurlto/afolder/in/cloudvault", value = "")


    public String getCloudvaultLocation() {
        return cloudvaultLocation;
    }

    public void setCloudvaultLocation(String cloudvaultLocation) {
        this.cloudvaultLocation = cloudvaultLocation;
    }

    public LayerDto maclocation(String maclocation) {
        this.maclocation = maclocation;
        return this;
    }

    /**
     * Get maclocation
     * @return maclocation
     */
    @ApiModelProperty(example = "todo: a UNC path on FEMA network?", value = "")


    public String getMaclocation() {
        return maclocation;
    }

    public void setMaclocation(String maclocation) {
        this.maclocation = maclocation;
    }

    public LayerDto oracletable(String oracletable) {
        this.oracletable = oracletable;
        return this;
    }

    /**
     * Get oracletable
     * @return oracletable
     */
    @ApiModelProperty(example = "someserver.someschema.sometable", value = "")


    public String getOracletable() {
        return oracletable;
    }

    public void setOracletable(String oracletable) {
        this.oracletable = oracletable;
    }

    public LayerDto fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get fileName
     * @return fileName
     */
    @ApiModelProperty(value = "")


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public LayerDto fileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * Get fileSize
     * @return fileSize
     */
    @ApiModelProperty(example = "123 GB", value = "")


    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public LayerDto docreqs(String docreqs) {
        this.docreqs = docreqs;
        return this;
    }

    /**
     * documentation requirements
     * @return docreqs
     */
    @ApiModelProperty(value = "documentation requirements")


    public String getDocreqs() {
        return docreqs;
    }

    public void setDocreqs(String docreqs) {
        this.docreqs = docreqs;
    }

    public LayerDto goal(String goal) {
        this.goal = goal;
        return this;
    }

    /**
     * Geospatial goal application/ Question#
     * @return goal
     */
    @ApiModelProperty(value = "Geospatial goal application/ Question#")


    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public LayerDto numberofrecords(Long numberofrecords) {
        this.numberofrecords = numberofrecords;
        return this;
    }

    /**
     * Get numberofrecords
     * @return numberofrecords
     */
    @ApiModelProperty(example = "9876", value = "")


    public Long getNumberofrecords() {
        return numberofrecords;
    }

    public void setNumberofrecords(Long numberofrecords) {
        this.numberofrecords = numberofrecords;
    }

    public LayerDto numberofcolumns(Long numberofcolumns) {
        this.numberofcolumns = numberofcolumns;
        return this;
    }

    /**
     * Get numberofcolumns
     * @return numberofcolumns
     */
    @ApiModelProperty(example = "22", value = "")


    public Long getNumberofcolumns() {
        return numberofcolumns;
    }

    public void setNumberofcolumns(Long numberofcolumns) {
        this.numberofcolumns = numberofcolumns;
    }

    public LayerDto dataelements(Long dataelements) {
        this.dataelements = dataelements;
        return this;
    }

    /**
     * Get dataelements
     * @return dataelements
     */
    @ApiModelProperty(example = "33", value = "")


    public Long getDataelements() {
        return dataelements;
    }

    public void setDataelements(Long dataelements) {
        this.dataelements = dataelements;
    }

    public LayerDto approvalPtapia(String approvalPtapia) {
        this.approvalPtapia = approvalPtapia;
        return this;
    }

    /**
     * PTA/PIA updated and approved
     * @return approvalPtapia
     */
    @ApiModelProperty(example = "todo: an example", value = "PTA/PIA updated and approved")


    public String getApprovalPtapia() {
        return approvalPtapia;
    }

    public void setApprovalPtapia(String approvalPtapia) {
        this.approvalPtapia = approvalPtapia;
    }

    public LayerDto approvalIsso(String approvalIsso) {
        this.approvalIsso = approvalIsso;
        return this;
    }

    /**
     * Approval from ISSO and System Owner for use in Beta / Prod environments (Link Jira Ticket)
     * @return approvalIsso
     */
    @ApiModelProperty(value = "Approval from ISSO and System Owner for use in Beta / Prod environments (Link Jira Ticket)")


    public String getApprovalIsso() {
        return approvalIsso;
    }

    public void setApprovalIsso(String approvalIsso) {
        this.approvalIsso = approvalIsso;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LayerDto layerDto = (LayerDto) o;
        return Objects.equals(this.id, layerDto.id) &&
                Objects.equals(this.shortName, layerDto.shortName) &&
                Objects.equals(this.longName, layerDto.longName) &&
                Objects.equals(this.description, layerDto.description) &&
                Objects.equals(this.steward, layerDto.steward) &&
                Objects.equals(this.sourceLayer, layerDto.sourceLayer) &&
                Objects.equals(this.sourceLocation, layerDto.sourceLocation) &&
                Objects.equals(this.cloudvaultLocation, layerDto.cloudvaultLocation) &&
                Objects.equals(this.maclocation, layerDto.maclocation) &&
                Objects.equals(this.oracletable, layerDto.oracletable) &&
                Objects.equals(this.fileName, layerDto.fileName) &&
                Objects.equals(this.fileSize, layerDto.fileSize) &&
                Objects.equals(this.docreqs, layerDto.docreqs) &&
                Objects.equals(this.goal, layerDto.goal) &&
                Objects.equals(this.numberofrecords, layerDto.numberofrecords) &&
                Objects.equals(this.numberofcolumns, layerDto.numberofcolumns) &&
                Objects.equals(this.dataelements, layerDto.dataelements) &&
                Objects.equals(this.approvalPtapia, layerDto.approvalPtapia) &&
                Objects.equals(this.approvalIsso, layerDto.approvalIsso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shortName, longName, description, steward, sourceLayer, sourceLocation, cloudvaultLocation, maclocation, oracletable, fileName, fileSize, docreqs, goal, numberofrecords, numberofcolumns, dataelements, approvalPtapia, approvalIsso);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LayerDto {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
        sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    steward: ").append(toIndentedString(steward)).append("\n");
        sb.append("    sourceLayer: ").append(toIndentedString(sourceLayer)).append("\n");
        sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
        sb.append("    cloudvaultLocation: ").append(toIndentedString(cloudvaultLocation)).append("\n");
        sb.append("    maclocation: ").append(toIndentedString(maclocation)).append("\n");
        sb.append("    oracletable: ").append(toIndentedString(oracletable)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    docreqs: ").append(toIndentedString(docreqs)).append("\n");
        sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
        sb.append("    numberofrecords: ").append(toIndentedString(numberofrecords)).append("\n");
        sb.append("    numberofcolumns: ").append(toIndentedString(numberofcolumns)).append("\n");
        sb.append("    dataelements: ").append(toIndentedString(dataelements)).append("\n");
        sb.append("    approvalPtapia: ").append(toIndentedString(approvalPtapia)).append("\n");
        sb.append("    approvalIsso: ").append(toIndentedString(approvalIsso)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
