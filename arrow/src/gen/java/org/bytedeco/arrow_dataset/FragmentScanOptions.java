// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief Per-scan options for fragment(s) in a dataset.
 * 
 *  These options are not intrinsic to the format or fragment itself, but do affect
 *  the results of a scan. These are options which make sense to change between
 *  repeated reads of the same dataset, such as format-specific conversion options
 *  (that do not affect the schema).
 * 
 *  \ingroup dataset-scanning */
@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class FragmentScanOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FragmentScanOptions(Pointer p) { super(p); }

  public native @StdString String type_name();
  public native @StdString String ToString();
}