package start.mongo.reactivestream.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pdr1")
public class PDRAddSubscription extends PDRRecord {
//    @Id
    private String pdrFeatureSeq;

    //@Id
    private String pdrSocID;

    private String pdrFeatureCode;

    private String pdrIsActive;

    private String pdrEndDate;

    private String pdrSubscriptionID;

    private String pdrProvAction;

    private String pdrStartDate;

    private String pdrProvStatus;

    private String pdrPaymentInd;

    /* builders */
    public PDRAddSubscription pdrSocID(String pdrSocID) {
        this.pdrSocID = pdrSocID;
        return this;
    }

    public PDRAddSubscription pdrFeatureCode(String pdrFeatureCode) {
        this.pdrFeatureCode = pdrFeatureCode;
        return this;
    }

    public PDRAddSubscription pdrFeatureSeq(String pdrFeatureSeq) {
        this.pdrFeatureSeq = pdrFeatureSeq;
        return this;
    }

    public PDRAddSubscription pdrIsActive(String pdrIsActive) {
        this.pdrIsActive = pdrIsActive;
        return this;
    }

    public PDRAddSubscription pdrSubscriptionID(String pdrSubscriptionID) {
        this.pdrSubscriptionID = pdrSubscriptionID;
        return this;
    }

    public PDRAddSubscription pdrProvAction(String pdrProvAction) {
        this.pdrProvAction = pdrProvAction;
        return this;
    }

    public PDRAddSubscription pdrProvStatus(String pdrProvStatus) {
        this.pdrProvStatus = pdrProvStatus;
        return this;
    }

    public PDRAddSubscription pdrEndDate(String pdrEndDateDate) {
        this.pdrEndDate = pdrEndDateDate;
        return this;
    }

    public PDRAddSubscription pdrStartDate(String pdrStartDate) {
        this.pdrStartDate = pdrStartDate;
        return this;
    }

    public PDRAddSubscription pdrPaymentInd(String pdrPaymentInd) {
        this.pdrPaymentInd = pdrPaymentInd;
        return this;
    }

    public String getPdrFeatureCode() {
        return pdrFeatureCode;
    }

    public void setPdrFeatureCode(String pdrFeatureCode) {
        this.pdrFeatureCode = pdrFeatureCode;
    }

    public String getPdrSocID() {
        return pdrSocID;
    }

    public void setPdrSocID(String pdrSocID) {
        this.pdrSocID = pdrSocID;
    }

    public String getPdrIsActive() {
        return pdrIsActive;
    }

    public void setPdrIsActive(String pdrIsActive) {
        this.pdrIsActive = pdrIsActive;
    }

    public String getPdrEndDate() {
        return pdrEndDate;
    }

    public void setPdrEndDate(String pdrEndDate) {
        this.pdrEndDate = pdrEndDate;
    }

    public String getPdrSubscriptionID() {
        return pdrSubscriptionID;
    }

    public void setPdrSubscriptionID(String pdrSubscriptionID) {
        this.pdrSubscriptionID = pdrSubscriptionID;
    }

    public String getPdrProvAction() {
        return pdrProvAction;
    }

    public void setPdrProvAction(String pdrProvAction) {
        this.pdrProvAction = pdrProvAction;
    }

    public String getPdrStartDate() {
        return pdrStartDate;
    }

    public void setPdrStartDate(String pdrStartDate) {
        this.pdrStartDate = pdrStartDate;
    }

    public String getPdrFeatureSeq() {
        return pdrFeatureSeq;
    }

    public void setPdrFeatureSeq(String pdrFeatureSeq) {
        this.pdrFeatureSeq = pdrFeatureSeq;
    }

    public String getPdrProvStatus() {
        return pdrProvStatus;
    }

    public void setPdrProvStatus(String pdrProvStatus) {
        this.pdrProvStatus = pdrProvStatus;
    }

    public String getPdrPaymentInd() {
        return pdrPaymentInd;
    }

    public void setPdrPaymentInd(String pdrPaymentInd) {
        this.pdrPaymentInd = pdrPaymentInd;
    }

    @Override
    public String toString() {
        return "ClassPojo [super().toString() + pdrProvAction = " + pdrProvAction + ", pdrProvStatus = " + pdrProvStatus + ", pdrSubscriptionID = " + pdrSubscriptionID + ", pdrSocID = " + pdrSocID + ", pdrFeatureCode = " + pdrFeatureCode + ",  pdrStartDate = " + pdrStartDate + ", pdrEndDate = " + pdrEndDate + ", pdrIsActive = " + pdrIsActive + ", pdrPaymentInd = " + pdrPaymentInd + ", pdrFeatureSeq = " + pdrFeatureSeq + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((pdrEndDate == null) ? 0 : pdrEndDate.hashCode());
        result = prime * result + ((pdrFeatureCode == null) ? 0 : pdrFeatureCode.hashCode());
        result = prime * result + ((pdrFeatureSeq == null) ? 0 : pdrFeatureSeq.hashCode());
        result = prime * result + ((pdrIsActive == null) ? 0 : pdrIsActive.hashCode());
        result = prime * result + ((pdrPaymentInd == null) ? 0 : pdrPaymentInd.hashCode());
        result = prime * result + ((pdrProvAction == null) ? 0 : pdrProvAction.hashCode());
        result = prime * result + ((pdrProvStatus == null) ? 0 : pdrProvStatus.hashCode());
        result = prime * result + ((pdrSocID == null) ? 0 : pdrSocID.hashCode());
        result = prime * result + ((pdrStartDate == null) ? 0 : pdrStartDate.hashCode());
        result = prime * result + ((pdrSubscriptionID == null) ? 0 : pdrSubscriptionID.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        PDRAddSubscription other = (PDRAddSubscription) obj;
        if (pdrEndDate == null) {
            if (other.pdrEndDate != null)
                return false;
        } else if (!pdrEndDate.equals(other.pdrEndDate))
            return false;
        if (pdrFeatureCode == null) {
            if (other.pdrFeatureCode != null)
                return false;
        } else if (!pdrFeatureCode.equals(other.pdrFeatureCode))
            return false;
        if (pdrFeatureSeq == null) {
            if (other.pdrFeatureSeq != null)
                return false;
        } else if (!pdrFeatureSeq.equals(other.pdrFeatureSeq))
            return false;
        if (pdrIsActive == null) {
            if (other.pdrIsActive != null)
                return false;
        } else if (!pdrIsActive.equals(other.pdrIsActive))
            return false;
        if (pdrPaymentInd == null) {
            if (other.pdrPaymentInd != null)
                return false;
        } else if (!pdrPaymentInd.equals(other.pdrPaymentInd))
            return false;
        if (pdrProvAction == null) {
            if (other.pdrProvAction != null)
                return false;
        } else if (!pdrProvAction.equals(other.pdrProvAction))
            return false;
        if (pdrProvStatus == null) {
            if (other.pdrProvStatus != null)
                return false;
        } else if (!pdrProvStatus.equals(other.pdrProvStatus))
            return false;
        if (pdrSocID == null) {
            if (other.pdrSocID != null)
                return false;
        } else if (!pdrSocID.equals(other.pdrSocID))
            return false;
        if (pdrStartDate == null) {
            if (other.pdrStartDate != null)
                return false;
        } else if (!pdrStartDate.equals(other.pdrStartDate))
            return false;
        if (pdrSubscriptionID == null) {
            if (other.pdrSubscriptionID != null)
                return false;
        } else if (!pdrSubscriptionID.equals(other.pdrSubscriptionID))
            return false;
        return true;
    }


}
