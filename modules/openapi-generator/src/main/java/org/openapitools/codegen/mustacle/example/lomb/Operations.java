package org.openapitools.codegen.mustacle.example.lomb;

import java.util.List;
import lombok.Data;

@Data
public class Operations{
	private String classname;
	private List<OperationItem> operation;
	private String pathPrefix;
}