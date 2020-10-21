package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class Logger extends CommonBase {
	Logger(Object _dummy, long ptr) { super(ptr); }
	public Logger(bindings.LDKLogger arg) {
		super(bindings.LDKLogger_new(arg));
		this.ptrs_to.add(arg);
	}
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		bindings.Logger_free(ptr); super.finalize();
	}

}