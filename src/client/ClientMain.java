package client;

import javax.xml.rpc.ServiceException;

import com.zoudys.Banque;
import com.zoudys.BanquePortBindingStub;
import com.zoudys.BanqueWS;

public class ClientMain {

	public static void main(String[] args) throws Exception, ServiceException {

		Banque stub = ((BanqueWS) new BanquePortBindingStub()).getBanquePort();
		stub.test();
		stub.conversionEuroFcfa(12);
	}

}
