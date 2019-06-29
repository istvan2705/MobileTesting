package model;

public class Email {
    private String emailAddress;
    private String emailSubject;
    private String emailText;

    public Email() {
          }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Email)) return false;
        Email email = (Email) o;
        if (getEmailAddress() != null ? !getEmailAddress().equals(email.getEmailAddress()) : email.getEmailAddress() != null) return false;
        if (getEmailSubject() != null ? !getEmailSubject().equals(email.getEmailSubject()) : email.getEmailSubject() != null)
            return false;
        return getEmailText() != null ? getEmailText().equals(email.getEmailText()) : email.getEmailText() == null;
    }

    @Override
    public int hashCode() {
        int result = getEmailAddress() != null ? getEmailAddress().hashCode() : 0;
        result = 31 * result + (getEmailSubject() != null ? getEmailSubject().hashCode() : 0);
        result = 31 * result + (getEmailText() != null ? getEmailText().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Email{" +
                "emailAddress='" + emailAddress + '\'' +
                ", emailSubject='" + emailSubject + '\'' +
                ", emailText='" + emailText + '\'' +
                '}';
    }
}
