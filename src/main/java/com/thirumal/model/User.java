/**
 * 
 */
package com.thirumal.model;

import java.io.Serializable;

import com.thirumal.validation.ValidAadhaar;
import com.thirumal.validation.ValidPan;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author ThirumalM
 */
@Data
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8345149578245565733L;

	private Integer id;
	@NotBlank(message = "{user.name.notblank}")
	private String name;
	@ValidPan
	private String pan;
	@ValidAadhaar
	private String aadhaar;
}
