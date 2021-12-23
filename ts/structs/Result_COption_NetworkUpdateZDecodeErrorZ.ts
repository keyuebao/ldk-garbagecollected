
import CommonBase from './CommonBase';
import * as bindings from '../bindings' // TODO: figure out location

public class Result_COption_NetworkUpdateZDecodeErrorZ extends CommonBase {
	private Result_COption_NetworkUpdateZDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_COption_NetworkUpdateZDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_COption_NetworkUpdateZDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.CResult_COption_NetworkUpdateZDecodeErrorZ_is_ok(ptr)) {
			return new Result_COption_NetworkUpdateZDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_COption_NetworkUpdateZDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_COption_NetworkUpdateZDecodeErrorZ_OK extends Result_COption_NetworkUpdateZDecodeErrorZ {
		public final Option_NetworkUpdateZ res;
		private Result_COption_NetworkUpdateZDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			number res = bindings.LDKCResult_COption_NetworkUpdateZDecodeErrorZ_get_ok(ptr);
			Option_NetworkUpdateZ res_hu_conv = Option_NetworkUpdateZ.constr_from_ptr(res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
	}

	public static final class Result_COption_NetworkUpdateZDecodeErrorZ_Err extends Result_COption_NetworkUpdateZDecodeErrorZ {
		public final DecodeError err;
		private Result_COption_NetworkUpdateZDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			number err = bindings.LDKCResult_COption_NetworkUpdateZDecodeErrorZ_get_err(ptr);
			const err_hu_conv: DecodeError = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
	}

	public static Result_COption_NetworkUpdateZDecodeErrorZ constructor_ok(Option_NetworkUpdateZ o) {
		number ret = bindings.CResult_COption_NetworkUpdateZDecodeErrorZ_ok(o.ptr);
		Result_COption_NetworkUpdateZDecodeErrorZ ret_hu_conv = Result_COption_NetworkUpdateZDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	public static Result_COption_NetworkUpdateZDecodeErrorZ constructor_err(DecodeError e) {
		number ret = bindings.CResult_COption_NetworkUpdateZDecodeErrorZ_err(e == null ? 0 : e.ptr & ~1);
		Result_COption_NetworkUpdateZDecodeErrorZ ret_hu_conv = Result_COption_NetworkUpdateZDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	public boolean is_ok() {
		boolean ret = bindings.CResult_COption_NetworkUpdateZDecodeErrorZ_is_ok(this.ptr);
		return ret;
	}

	public number clone_ptr() {
		number ret = bindings.CResult_COption_NetworkUpdateZDecodeErrorZ_clone_ptr(this.ptr);
		return ret;
	}

	public Result_COption_NetworkUpdateZDecodeErrorZ clone() {
		number ret = bindings.CResult_COption_NetworkUpdateZDecodeErrorZ_clone(this.ptr);
		Result_COption_NetworkUpdateZDecodeErrorZ ret_hu_conv = Result_COption_NetworkUpdateZDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}