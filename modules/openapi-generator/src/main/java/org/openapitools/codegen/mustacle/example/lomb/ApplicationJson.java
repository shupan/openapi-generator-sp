package org.openapitools.codegen.mustacle.example.lomb;

import lombok.Data;

@Data
public class ApplicationJson{
	private Schema schema;
	private VendorExtensions vendorExtensions;
	private TestCases testCases;
}