package com.xworkz.contact.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class ContactDTO implements Serializable, Comparable<ContactDTO> {

	private String name;
	private String email;
	private long mobile;
	private String comments;
	private String fileName;
	private String contentType;
	private long fileSize;

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((comments == null) ? 0 : comments.hashCode());
	 * result = prime * result + ((contentType == null) ? 0 :
	 * contentType.hashCode()); result = prime * result + ((email == null) ? 0 :
	 * email.hashCode()); result = prime * result + ((fileName == null) ? 0 :
	 * fileName.hashCode()); result = prime * result + (int) (fileSize ^ (fileSize
	 * >>> 32)); result = prime * result + (int) (mobile ^ (mobile >>> 32)); result
	 * = prime * result + ((name == null) ? 0 : name.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) { return true;
	 * } if (!(obj instanceof ContactDTO)) { return false; } ContactDTO other =
	 * (ContactDTO) obj; if (comments == null) { if (other.comments != null) {
	 * return false; } } else if (!comments.equals(other.comments)) { return false;
	 * } if (contentType == null) { if (other.contentType != null) { return false; }
	 * } else if (!contentType.equals(other.contentType)) { return false; } if
	 * (email == null) { if (other.email != null) { return false; } } else if
	 * (!email.equals(other.email)) { return false; } if (fileName == null) { if
	 * (other.fileName != null) { return false; } } else if
	 * (!fileName.equals(other.fileName)) { return false; } if (fileSize !=
	 * other.fileSize) { return false; } if (mobile != other.mobile) { return false;
	 * } if (name == null) { if (other.name != null) { return false; } } else if
	 * (!name.equals(other.name)) { return false; } return true; } public
	 * ContactDTO(String name, String email, long mobile, String comments, String
	 * fileName, String contentType, long fileSize) { super(); this.name = name;
	 * this.email = email; this.mobile = mobile; this.comments = comments;
	 * this.fileName = fileName; this.contentType = contentType; this.fileSize =
	 * fileSize;
	 * 
	 * }
	 * 
	 * @Override public String toString() { return "ContactDTO [name=" + name +
	 * ", email=" + email + ", mobile=" + mobile + ", comments=" + comments +
	 * ", fileName=" + fileName + ", contentType=" + contentType + ", fileSize=" +
	 * fileSize + "]"; } public String getName() { return name; } public void
	 * setName(String name) { this.name = name; } public String getEmail() { return
	 * email; } public void setEmail(String email) { this.email = email; } public
	 * long getMobile() { return mobile; } public void setMobile(long mobile) {
	 * this.mobile = mobile; } public String getComments() { return comments; }
	 * public void setComments(String comments) { this.comments = comments; } public
	 * String getFileName() { return fileName; } public void setFileName(String
	 * fileName) { this.fileName = fileName; } public String getContentType() {
	 * return contentType; } public void setContentType(String contentType) {
	 * this.contentType = contentType; } public long getFileSize() { return
	 * fileSize; } public void setFileSize(long fileSize) { this.fileSize =
	 * fileSize; }
	 */

	@Override
	public int compareTo(ContactDTO o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}

	/*
	 * @Override public int compareTo(ContactDTO o) { // TODO Auto-generated method
	 * stub return this.getName().compareTo(o.getName()); }
	 */
}
