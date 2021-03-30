
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location

public class Result_ChannelConfigDecodeErrorZ extends CommonBase {
	private Result_ChannelConfigDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_ChannelConfigDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_ChannelConfigDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_ChannelConfigDecodeErrorZ_result_ok(ptr)) {
			return new Result_ChannelConfigDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_ChannelConfigDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_ChannelConfigDecodeErrorZ_OK extends Result_ChannelConfigDecodeErrorZ {
		public final ChannelConfig res;
		private Result_ChannelConfigDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			number res = bindings.LDKCResult_ChannelConfigDecodeErrorZ_get_ok(ptr);
			const res_hu_conv: ChannelConfig = new ChannelConfig(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
	}

	public static final class Result_ChannelConfigDecodeErrorZ_Err extends Result_ChannelConfigDecodeErrorZ {
		public final DecodeError err;
		private Result_ChannelConfigDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			number err = bindings.LDKCResult_ChannelConfigDecodeErrorZ_get_err(ptr);
			const err_hu_conv: DecodeError = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
	}

	public static Result_ChannelConfigDecodeErrorZ constructor__ok(ChannelConfig o) {
		number ret = bindings.CResult_ChannelConfigDecodeErrorZ_ok(o == null ? 0 : o.ptr & ~1);
		Result_ChannelConfigDecodeErrorZ ret_hu_conv = Result_ChannelConfigDecodeErrorZ.constr_from_ptr(ret);
		ret_hu_conv.ptrs_to.add(o);
		return ret_hu_conv;
	}

	public static Result_ChannelConfigDecodeErrorZ constructor__err(DecodeError e) {
		number ret = bindings.CResult_ChannelConfigDecodeErrorZ_err(e == null ? 0 : e.ptr & ~1);
		Result_ChannelConfigDecodeErrorZ ret_hu_conv = Result_ChannelConfigDecodeErrorZ.constr_from_ptr(ret);
		ret_hu_conv.ptrs_to.add(e);
		return ret_hu_conv;
	}

	public Result_ChannelConfigDecodeErrorZ _clone() {
		number ret = bindings.CResult_ChannelConfigDecodeErrorZ_clone(this.ptr);
		Result_ChannelConfigDecodeErrorZ ret_hu_conv = Result_ChannelConfigDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
