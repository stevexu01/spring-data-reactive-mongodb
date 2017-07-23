package start.mongo.reactivestream.documents;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Data mapped to incoming message from input channel
 * Created by zhifenxu on 5/23/2017.
 */
@JsonAutoDetect(fieldVisibility= JsonAutoDetect.Visibility.ANY, getterVisibility= JsonAutoDetect.Visibility.NONE,
        setterVisibility= JsonAutoDetect.Visibility.NONE, creatorVisibility= JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PDRRecord implements Serializable {
	
	/* Common parameters */
    @JsonProperty("pdrTransactionId")
    private String pdrTransactionID;
    
    @JsonProperty("pdrComponentId")
    private String pdrComponentID;
    
    private String pdrDateTime;
    
    private String pdrActionType;
  
    @JsonProperty("pdrAccountId")
    private String pdrAccountID;
    
    private String pdrSubscriberType;
    
    private String pdrNAG;
    
    private String pdrBAN;

    private String pdrMSISDN;
 
    private String pdrIMSI;
    
    private String pdrIMEI;

    private String pdrESN;
    
    private String pdrMEID;
    
    private String pdrActivationDateTime;
    
    private String pdrExpirationDateTime;

    @JsonProperty("pdrSiteId")
    private String pdrSiteID;
    
    @JsonProperty("pdrDomainId")
    private String pdrDomainID;
    
    @JsonProperty("pdrSubscriberId")
    private String pdrSubscriberID;
    
    @JsonProperty("xCorrelationId")
    protected String xCorrelationID;

    /* builders for common parameters */
    public PDRRecord pdrMSISDN(String pdrMSISDN){
        setPdrMSISDN(pdrMSISDN);
        return this;
    }

    public PDRRecord xCorrelationID (String xCorrelationID ){
        this.xCorrelationID = xCorrelationID;
        return this;
    }
    
    public PDRRecord pdrTransactionID(String pdrTransactionID){
        this.pdrTransactionID = pdrTransactionID;
        return this;
    }

    public PDRRecord pdrDateTime(String pdrDateTime){
        this.pdrDateTime = pdrDateTime;
        return this;
    }
    
    public PDRRecord pdrSubscriberID(String pdrSubscriberID){
        this.pdrSubscriberID = pdrSubscriberID;
        return this;
    }
    
    public PDRRecord pdrActionType(String pdrActionType){
        this.pdrActionType = pdrActionType;
        return this;
    }
    
    public PDRRecord pdrBAN(String pdrBAN){
        this.pdrBAN = pdrBAN;
        return this;
    }
    
    public PDRRecord pdrAccountID(String pdrAccountID){
        this.pdrAccountID = pdrAccountID;
        return this;
    }
    
    public PDRRecord pdrSubscriberType(String pdrSubscriberType){
        this.pdrSubscriberType = pdrSubscriberType;
        return this;
    }
    
    public PDRRecord pdrIMSI(String pdrIMSI){
        this.pdrIMSI = pdrIMSI;
        return this;
    }
    
    public PDRRecord pdrIMEI(String pdrIMEI){
        this.pdrIMEI = pdrIMEI;
        return this;
    }

    public PDRRecord pdrESN(String pdrESN){
        this.pdrESN = pdrESN;
        return this;
    }
    
    public PDRRecord pdrMEID(String pdrMEID){
        this.pdrMEID = pdrMEID;
        return this;
    }
    
    public PDRRecord pdrNAG(String pdrNAG){
        this.pdrNAG = pdrNAG;
        return this;
    }
    
    public PDRRecord pdrComponentID(String pdrComponentID){
        this.pdrComponentID = pdrComponentID;
        return this;
    }
    
    public PDRRecord pdrSiteID(String pdrSiteID){
        this.pdrSiteID = pdrSiteID;
        return this;
    }
    
    public PDRRecord pdrDomainID(String pdrDomainID){
        this.pdrDomainID = pdrDomainID;
        return this;
    }
    
    public PDRRecord pdrActivationDateTime(String pdrActivationDateTime){
        this.pdrActivationDateTime = pdrActivationDateTime;
        return this;
    }
    
    public PDRRecord pdrExpirationDateTime(String pdrExpirationDateTime){
        this.pdrExpirationDateTime = pdrExpirationDateTime;
        return this;
    }
    
    public String getPdrDateTime() {
        return pdrDateTime;
    }

    public void setPdrDateTime(String pdrDateTime) {
        this.pdrDateTime = pdrDateTime;
    }

    public String getPdrSubscriberType() {
        return pdrSubscriberType;
    }

    public void setPdrSubscriberType(String pdrSubscriberType) {
        this.pdrSubscriberType = pdrSubscriberType;
    }
    
    public String getPdrSubscriberID() {
        return pdrSubscriberID;
    }

    public void setPdrSubscriberID(String pdrSubscriberID) {
        this.pdrSubscriberID = pdrSubscriberID;
    }

    public String getPdrIMEI() {
        return pdrIMEI;
    }

    public void setPdrIMEI(String pdrIMEI) {
        this.pdrIMEI = pdrIMEI;
    }

    public String getPdrBAN() {
        return pdrBAN;
    }

    public void setPdrBAN(String pdrBAN) {
        this.pdrBAN = pdrBAN;
    }

    public String getXCorrelationID() {
        return xCorrelationID;
    }

    public void setXCorrelationID(String xCorrelationID) {
        this.xCorrelationID = xCorrelationID;
    }

    public String getPdrDomainID() {
        return pdrDomainID;
    }

    public void setPdrDomainID(String pdrDomainID) {
        this.pdrDomainID = pdrDomainID;
    }

    public String getPdrTransactionID() {
        return pdrTransactionID;
    }

    public void setPdrTransactionID(String pdrTransactionID) {
        this.pdrTransactionID = pdrTransactionID;
    }

    public String getPdrActivationDateTime() {
        return pdrActivationDateTime;
    }

    public void setPdrActivationDateTime(String pdrActivationDateTime) {
        this.pdrActivationDateTime = pdrActivationDateTime;
    }

    public String getPdrIMSI() {
        return pdrIMSI;
    }

    public void setPdrIMSI(String pdrIMSI) {
        this.pdrIMSI = pdrIMSI;
    }

    public String getPdrMSISDN() {
        return pdrMSISDN;
    }

    public void setPdrMSISDN(String pdrMSISDN) {
        this.pdrMSISDN = pdrMSISDN;
    }

    public String getPdrSiteID() {
        return pdrSiteID;
    }

    public void setPdrSiteID(String pdrSiteID) {
        this.pdrSiteID = pdrSiteID;
    }

    public String getPdrAccountID() {
        return pdrAccountID;
    }

    public void setPdrAccountID(String pdrAccountID) {
        this.pdrAccountID = pdrAccountID;
    }

    public String getPdrESN() {
        return pdrESN;
    }

    public void setPdrESN(String pdrESN) {
        this.pdrESN = pdrESN;
    }

    public String getPdrActionType() {
        return pdrActionType;
    }

    public void setPdrActionType(String pdrActionType) {
        this.pdrActionType = pdrActionType;
    }

    public String getPdrExpirationDateTime() {
        return pdrExpirationDateTime;
    }

    public void setPdrExpirationDateTime(String pdrExpirationDateTime) {
        this.pdrExpirationDateTime = pdrExpirationDateTime;
    }

    public String getPdrComponentID() {
        return pdrComponentID;
    }

    public void setPdrComponentID(String pdrComponentID) {
        this.pdrComponentID = pdrComponentID;
    }

    public String getPdrNAG() {
        return pdrNAG;
    }

    public void setPdrNAG(String pdrNAG) {
        this.pdrNAG = pdrNAG;
    }

    public String getPdrMEID() {
        return pdrMEID;
    }

    public void setPdrMEID(String pdrMEID) {
        this.pdrMEID = pdrMEID;
    }

    public String getxCorrelationID() {
        return xCorrelationID;
    }

    public void setxCorrelationID(String xCorrelationID) {
        this.xCorrelationID = xCorrelationID;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pdrAccountID == null) ? 0 : pdrAccountID.hashCode());
		result = prime * result + ((pdrActionType == null) ? 0 : pdrActionType.hashCode());
		result = prime * result + ((pdrActivationDateTime == null) ? 0 : pdrActivationDateTime.hashCode());
		result = prime * result + ((pdrBAN == null) ? 0 : pdrBAN.hashCode());
		result = prime * result + ((pdrComponentID == null) ? 0 : pdrComponentID.hashCode());
		result = prime * result + ((pdrDateTime == null) ? 0 : pdrDateTime.hashCode());
		result = prime * result + ((pdrDomainID == null) ? 0 : pdrDomainID.hashCode());
		result = prime * result + ((pdrESN == null) ? 0 : pdrESN.hashCode());
		result = prime * result + ((pdrExpirationDateTime == null) ? 0 : pdrExpirationDateTime.hashCode());
		result = prime * result + ((pdrIMEI == null) ? 0 : pdrIMEI.hashCode());
		result = prime * result + ((pdrIMSI == null) ? 0 : pdrIMSI.hashCode());
		result = prime * result + ((pdrMEID == null) ? 0 : pdrMEID.hashCode());
		result = prime * result + ((pdrMSISDN == null) ? 0 : pdrMSISDN.hashCode());
		result = prime * result + ((pdrNAG == null) ? 0 : pdrNAG.hashCode());
		result = prime * result + ((pdrSiteID == null) ? 0 : pdrSiteID.hashCode());
		result = prime * result + ((pdrSubscriberID == null) ? 0 : pdrSubscriberID.hashCode());
		result = prime * result + ((pdrSubscriberType == null) ? 0 : pdrSubscriberType.hashCode());
		result = prime * result + ((pdrTransactionID == null) ? 0 : pdrTransactionID.hashCode());
		result = prime * result + ((xCorrelationID == null) ? 0 : xCorrelationID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PDRRecord other = (PDRRecord) obj;
		if (pdrAccountID == null) {
			if (other.pdrAccountID != null)
				return false;
		} else if (!pdrAccountID.equals(other.pdrAccountID))
			return false;
		if (pdrActionType == null) {
			if (other.pdrActionType != null)
				return false;
		} else if (!pdrActionType.equals(other.pdrActionType))
			return false;
		if (pdrActivationDateTime == null) {
			if (other.pdrActivationDateTime != null)
				return false;
		} else if (!pdrActivationDateTime.equals(other.pdrActivationDateTime))
			return false;
		if (pdrBAN == null) {
			if (other.pdrBAN != null)
				return false;
		} else if (!pdrBAN.equals(other.pdrBAN))
			return false;
		if (pdrComponentID == null) {
			if (other.pdrComponentID != null)
				return false;
		} else if (!pdrComponentID.equals(other.pdrComponentID))
			return false;
		if (pdrDateTime == null) {
			if (other.pdrDateTime != null)
				return false;
		} else if (!pdrDateTime.equals(other.pdrDateTime))
			return false;
		if (pdrDomainID == null) {
			if (other.pdrDomainID != null)
				return false;
		} else if (!pdrDomainID.equals(other.pdrDomainID))
			return false;
		if (pdrESN == null) {
			if (other.pdrESN != null)
				return false;
		} else if (!pdrESN.equals(other.pdrESN))
			return false;
		if (pdrExpirationDateTime == null) {
			if (other.pdrExpirationDateTime != null)
				return false;
		} else if (!pdrExpirationDateTime.equals(other.pdrExpirationDateTime))
			return false;
		if (pdrIMEI == null) {
			if (other.pdrIMEI != null)
				return false;
		} else if (!pdrIMEI.equals(other.pdrIMEI))
			return false;
		if (pdrIMSI == null) {
			if (other.pdrIMSI != null)
				return false;
		} else if (!pdrIMSI.equals(other.pdrIMSI))
			return false;
		if (pdrMEID == null) {
			if (other.pdrMEID != null)
				return false;
		} else if (!pdrMEID.equals(other.pdrMEID))
			return false;
		if (pdrMSISDN == null) {
			if (other.pdrMSISDN != null)
				return false;
		} else if (!pdrMSISDN.equals(other.pdrMSISDN))
			return false;
		if (pdrNAG == null) {
			if (other.pdrNAG != null)
				return false;
		} else if (!pdrNAG.equals(other.pdrNAG))
			return false;
		if (pdrSiteID == null) {
			if (other.pdrSiteID != null)
				return false;
		} else if (!pdrSiteID.equals(other.pdrSiteID))
			return false;
		if (pdrSubscriberID == null) {
			if (other.pdrSubscriberID != null)
				return false;
		} else if (!pdrSubscriberID.equals(other.pdrSubscriberID))
			return false;
		if (pdrSubscriberType == null) {
			if (other.pdrSubscriberType != null)
				return false;
		} else if (!pdrSubscriberType.equals(other.pdrSubscriberType))
			return false;
		if (pdrTransactionID == null) {
			if (other.pdrTransactionID != null)
				return false;
		} else if (!pdrTransactionID.equals(other.pdrTransactionID))
			return false;
		if (xCorrelationID == null) {
			if (other.xCorrelationID != null)
				return false;
		} else if (!xCorrelationID.equals(other.xCorrelationID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PDRRecord [pdrTransactionID=" + pdrTransactionID + ", pdrComponentID=" + pdrComponentID
				+ ", pdrDateTime=" + pdrDateTime + ", pdrActionType=" + pdrActionType + ", pdrAccountID=" + pdrAccountID
				+ ", pdrSubscriberType=" + pdrSubscriberType + ", pdrNAG=" + pdrNAG + ", pdrBAN=" + pdrBAN
				+ ", pdrMSISDN=" + pdrMSISDN + ", pdrIMSI=" + pdrIMSI + ", pdrIMEI=" + pdrIMEI + ", pdrESN=" + pdrESN
				+ ", pdrMEID=" + pdrMEID + ", pdrActivationDateTime=" + pdrActivationDateTime
				+ ", pdrExpirationDateTime=" + pdrExpirationDateTime + ", pdrSiteID=" + pdrSiteID + ", pdrDomainID="
				+ pdrDomainID + ", pdrSubscriberID=" + pdrSubscriberID + ", xCorrelationID=" + xCorrelationID + "]";
	}
	
}

