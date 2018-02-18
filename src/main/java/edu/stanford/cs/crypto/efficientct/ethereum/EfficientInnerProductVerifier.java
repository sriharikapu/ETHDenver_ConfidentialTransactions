package edu.stanford.cs.crypto.efficientct.ethereum;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.2.0.
 */
public class EfficientInnerProductVerifier extends Contract {
    private static final String BINARY = "0x606060405234156200001057600080fd5b60405161084080620017bf833981016040526200003790678000000000000000906200021f565b600060408051908101604052808681526020018581525060406000820151816000015560208201518160010155905050600090505b60108160ff1610156200016b576040805190810160405280848360ff166020811015156200009657fe5b60200201518152602001848360ff16601001602081101515620000b557fe5b602002015181525060008260ff16601081101515620000d057fe5b6002020160008201518160000155602082015181600101559050506040805190810160405280838360ff166020811015156200010857fe5b60200201518152602001838360ff166010016020811015156200012757fe5b602002015181525060208260ff166010811015156200014257fe5b60020201600082015181600001556020820151816001015590505080806001019150506200006c565b505050505062000306565b600082601f830112600081146200018d5762000192565b600080fd5b506020620001aa620001a482620002cf565b62000297565b91508183856020840282011160018114620001c557620001ca565b600080fd5b5060005b83811015620001ff5781620001e4888262000209565b845260208401935060208301925050600181019050620001ce565b5050505092915050565b6000620002178251620002fc565b905092915050565b60008060008061084085870312600181146200023b5762000240565b600080fd5b506000620002518782880162000209565b9450506020620002648782880162000209565b9350506040620002778782880162000176565b9250506104406200028b8782880162000176565b91505092959194509250565b6000604051905081810181811067ffffffffffffffff82111760018114620002bf57620002c4565b600080fd5b508060405250919050565b600067ffffffffffffffff821160018114620002eb57620002f0565b600080fd5b50602082029050919050565b6000819050919050565b6114a980620003166000396000f300606060405260043610610083576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680632e52d606146100885780633844923b146100b15780635a2ee019146100e857806370a5d8611461011157806383ec1a491461013b578063af395cc814610172578063fdcfb4a6146101a8575b600080fd5b341561009357600080fd5b61009b6101de565b6040516100a8919061137f565b60405180910390f35b34156100bc57600080fd5b6100d160046100cc903690611255565b6101e3565b6040516100df92919061139a565b60405180910390f35b34156100f357600080fd5b6100fb61020c565b604051610108919061137f565b60405180910390f35b341561011c57600080fd5b610124610211565b60405161013292919061139a565b60405180910390f35b341561014657600080fd5b61015b6004610156903690611255565b610223565b60405161016992919061139a565b60405180910390f35b341561017d57600080fd5b610192600461018d903690611287565b61024c565b60405161019f9190611364565b60405180910390f35b34156101b357600080fd5b6101c860046101c3903690611181565b61038c565b6040516101d59190611364565b60405180910390f35b600481565b6020816010811015156101f257fe5b600202016000915090508060000154908060010154905082565b601081565b60408060000154908060010154905082565b60008160108110151561023257fe5b600202016000915090508060000154908060010154905082565b600061037e60408051908101604052808b81526020018a815250886004806020026040519081016040528092919082600460200280828437820191505050505088600480602002604051908101604052809291908260046020028082843782019150505050508860048060200260405190810160405280929190826004602002808284378201915050505050886004806020026040519081016040528092919082600460200280828437820191505050505088886020601080602002604051908101604052809291906000905b82821015610355578382600202016040805190810160405290816000820154815260200160018201548152505081526020019060010190610319565b50505050604080805190810160405290816000820154815260200160018201548152505061038c565b905098975050505050505050565b6000610396610d56565b60008060008d8460400181905250600092505b60048360ff1610156105975760408051908101604052808e8560ff166004811015156103d157fe5b602002015181526020018d8560ff166004811015156103ec57fe5b6020020151815250846060018190525060408051908101604052808c8560ff1660048110151561041857fe5b602002015181526020018b8560ff1660048110151561043357fe5b602002015181525084608001819052506104bd8460600151600001518560600151602001518660400151600001518760400151602001518860800151600001518960800151602001516040518087815260200186815260200185815260200184815260200183815260200182815260200196505050505050506040518091039020600190046108df565b8460a00181815250506104d38460a00151610914565b8460c001818152505061055f846040015161055161051561050260028960c0015161094a90919063ffffffff16565b8860800151610a4a90919063ffffffff16565b61054361053060028a60a0015161094a90919063ffffffff16565b8960600151610a4a90919063ffffffff16565b610acb90919063ffffffff16565b610acb90919063ffffffff16565b84604001819052508360a001518460e001518460ff1660048110151561058157fe5b60200201818152505082806001019350506103a9565b8360e0015160006004811015156105aa57fe5b602002015184610100015160006010811015156105c357fe5b602002018181525050600192505b60048360ff16101561064b576106218460e001518460ff166004811015156105f557fe5b6020020151856101000151600060108110151561060e57fe5b6020020151610b6d90919063ffffffff16565b846101000151600060108110151561063557fe5b60200201818152505082806001019350506105d1565b61066c846101000151600060108110151561066257fe5b6020020151610914565b846101000151600060108110151561068057fe5b602002018181525050600092505b6002601081151561069b57fe5b048360ff1610156107dd57600091505b6010838360ff1660019060020a020160ff1610156107d2578160ff1660019060020a0283019050836101a001518160ff166010811015156106e857fe5b602002015115156107c7576107448460e001518360ff1660016004030360048110151561071157fe5b60200201518560e001518460ff1660016004030360048110151561073157fe5b6020020151610b6d90919063ffffffff16565b846101c0018181525050610780846101c001518561010001518560ff1660108110151561076d57fe5b6020020151610b6d90919063ffffffff16565b8461010001518260ff1660108110151561079657fe5b6020020181815250506001846101a001518260ff166010811015156107b757fe5b6020020190151590811515815250505b8160010191506106ab565b82600101925061068e565b6107eb846101000151610b9b565b84610120018190525061080384610100015188610c92565b84610140018190525061081f888a610b6d90919063ffffffff16565b8461016001818152505061089361084485610160015188610a4a90919063ffffffff16565b61088561085f8b886101400151610a4a90919063ffffffff16565b6108778d896101200151610a4a90919063ffffffff16565b610acb90919063ffffffff16565b610acb90919063ffffffff16565b846101800181905250836040015160000151846101800151600001511480156108cc575083604001516020015184610180015160200151145b9450505050509998505050505050505050565b60007f30644e72e131a029b85045b68181585d2833e84879b9709143e1f593f00000018281151561090c57fe5b069050919050565b60006109438260027f30644e72e131a029b85045b68181585d2833e84879b9709143e1f593f00000010361094a565b9050919050565b6000610954610e0f565b61095c610e37565b602082600060068110151561096d57fe5b602002018181525050602082600160068110151561098757fe5b60200201818152505060208260026006811015156109a157fe5b602002018181525050848260036006811015156109ba57fe5b602002018181525050838260046006811015156109d357fe5b6020020181815250507f30644e72e131a029b85045b68181585d2833e84879b9709143e1f593f0000001826005600681101515610a0c57fe5b60200201818152505060208160c0846005600019fa1515610a2c57600080fd5b806000600181101515610a3b57fe5b60200201519250505092915050565b610a52610e5f565b610a5a610e79565b8360000151816000600381101515610a6e57fe5b6020020181815250508360200151816001600381101515610a8b57fe5b60200201818152505082816002600381101515610aa457fe5b6020020181815250506040826060836007600019fa1515610ac457600080fd5b5092915050565b610ad3610e5f565b610adb610ea1565b8360000151816000600481101515610aef57fe5b6020020181815250508360200151816001600481101515610b0c57fe5b6020020181815250508260000151816002600481101515610b2957fe5b6020020181815250508260200151816003600481101515610b4657fe5b6020020181815250506040826080836006600019fa1515610b6657600080fd5b5092915050565b60007f30644e72e131a029b85045b68181585d2833e84879b9709143e1f593f0000001828409905092915050565b610ba3610e5f565b6000610bfc836000601081101515610bb757fe5b6020020151600080601081101515610bcb57fe5b6002020160408051908101604052908160008201548152602001600182015481525050610a4a90919063ffffffff16565b9150600190505b60108160ff161015610c8c57610c7d610c6e848360ff16601081101515610c2657fe5b602002015160008460ff16601081101515610c3d57fe5b6002020160408051908101604052908160008201548152602001600182015481525050610a4a90919063ffffffff16565b83610acb90919063ffffffff16565b91508080600101915050610c03565b50919050565b610c9a610e5f565b6000610cd8846001601003601081101515610cb157fe5b6020020151846000601081101515610cc557fe5b6020020151610a4a90919063ffffffff16565b9150600190505b60108160ff161015610d4f57610d40610d31858360ff16600160100303601081101515610d0857fe5b6020020151858460ff16601081101515610d1e57fe5b6020020151610a4a90919063ffffffff16565b83610acb90919063ffffffff16565b91508080600101915050610cdf565b5092915050565b610ac060405190810160405280610d6b610ec9565b8152602001610d78610ef8565b8152602001610d85610ef8565b8152602001610d92610ef8565b8152602001610d9f610ef8565b81526020016000815260200160008152602001610dba610f12565b8152602001610dc7610f3a565b8152602001610dd4610ef8565b8152602001610de1610ef8565b815260200160008152602001610df5610ef8565b8152602001610e02610f63565b8152602001600081525090565b60c0604051908101604052806006905b6000815260200190600190039081610e1f5790505090565b6020604051908101604052806001905b6000815260200190600190039081610e475790505090565b604080519081016040528060008152602001600081525090565b6060604051908101604052806003905b6000815260200190600190039081610e895790505090565b6080604051908101604052806004905b6000815260200190600190039081610eb15790505090565b610400604051908101604052806010905b610ee2610ef8565b815260200190600190039081610eda5790505090565b604080519081016040528060008152602001600081525090565b6080604051908101604052806004905b6000815260200190600190039081610f225790505090565b610200604051908101604052806010905b6000815260200190600190039081610f4b5790505090565b610200604051908101604052806010905b60001515815260200190600190039081610f745790505090565b600082601f83011260008114610fa357610fa8565b600080fd5b506010610fbc610fb7826113f9565b6113c3565b91508183856040840282011160018114610fd557610fda565b600080fd5b5060005b8381101561100b5781610ff188826110c3565b845260208401935060408301925050600181019050610fde565b5050505092915050565b60008190508260206004028201116001811461103057611035565b600080fd5b5092915050565b600082601f8301126000811461105157611056565b600080fd5b50600461106a61106582611424565b6113c3565b9150818385602084028201116001811461108357611088565b600080fd5b5060005b838110156110b9578161109f888261116d565b84526020840193506020830192505060018101905061108c565b5050505092915050565b6000604082840312600181146110d8576110dd565b600080fd5b506110e860406113c3565b905060006110f88482850161116d565b600083015250602061110c8482850161116d565b60208301525092915050565b60006040828403126001811461112d57611132565b600080fd5b5061113d60406113c3565b9050600061114d8482850161116d565b60008301525060206111618482850161116d565b60208301525092915050565b60006111798235611465565b905092915050565b60008060008060008060008060006106c08a8c0312600181146111a3576111a8565b600080fd5b5060006111b78c828d01611118565b99505060406111c88c828d0161103c565b98505060c06111d98c828d0161103c565b9750506101406111eb8c828d0161103c565b9650506101c06111fd8c828d0161103c565b95505061024061120f8c828d0161116d565b9450506102606112218c828d0161116d565b9350506102806112338c828d01610f8e565b9250506106806112458c828d01611118565b9150509295985092959850929598565b60006020828403126001811461126a5761126f565b600080fd5b50600061127e8482850161116d565b91505092915050565b600080600080600080600080610280898b0312600181146112a7576112ac565b600080fd5b5060006112bb8b828c0161116d565b98505060206112cc8b828c0161116d565b97505060406112dd8b828c01611015565b96505060c06112ee8b828c01611015565b9550506101406113008b828c01611015565b9450506101c06113128b828c01611015565b9350506102406113248b828c0161116d565b9250506102606113368b828c0161116d565b9150509295985092959890939650565b61134f8161144f565b82525050565b61135e8161145b565b82525050565b60006020820190506113796000830184611346565b92915050565b60006020820190506113946000830184611355565b92915050565b60006040820190506113af6000830185611355565b6113bc6020830184611355565b9392505050565b6000604051905081810181811067ffffffffffffffff821117600181146113e9576113ee565b600080fd5b508060405250919050565b600067ffffffffffffffff82116001811461141357611418565b600080fd5b50602082029050919050565b600067ffffffffffffffff82116001811461143e57611443565b600080fd5b50602082029050919050565b60008115159050919050565b6000819050919050565b60008190509190505600a265627a7a723058209ec6f13280de7ea56bf08b8ef04cffbfb865759c9077f02ab65db90838904bd66c6578706572696d656e74616cf50037";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<>();
    }

    protected EfficientInnerProductVerifier(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected EfficientInnerProductVerifier(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<BigInteger> n() {
        Function function = new Function("n", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Tuple2<BigInteger, BigInteger>> hs(BigInteger param0) {
        final Function function = new Function("hs", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple2<BigInteger, BigInteger>>(
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);;
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> m() {
        Function function = new Function("m", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Tuple2<BigInteger, BigInteger>> H() {
        final Function function = new Function("H", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple2<BigInteger, BigInteger>>(
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);;
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<Tuple2<BigInteger, BigInteger>> gs(BigInteger param0) {
        final Function function = new Function("gs", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple2<BigInteger, BigInteger>>(
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);;
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public static RemoteCall<EfficientInnerProductVerifier> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger H_x, BigInteger H_y, List<BigInteger> gs_coords, List<BigInteger> hs_coords) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(H_x), 
                new org.web3j.abi.datatypes.generated.Uint256(H_y), 
                new org.web3j.abi.datatypes.generated.StaticArray32<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(gs_coords, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.StaticArray32<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(hs_coords, org.web3j.abi.datatypes.generated.Uint256.class))));
        return deployRemoteCall(EfficientInnerProductVerifier.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<EfficientInnerProductVerifier> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger H_x, BigInteger H_y, List<BigInteger> gs_coords, List<BigInteger> hs_coords) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(H_x), 
                new org.web3j.abi.datatypes.generated.Uint256(H_y), 
                new org.web3j.abi.datatypes.generated.StaticArray32<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(gs_coords, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.StaticArray32<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(hs_coords, org.web3j.abi.datatypes.generated.Uint256.class))));
        return deployRemoteCall(EfficientInnerProductVerifier.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public RemoteCall<Boolean> verify(BigInteger c_x, BigInteger c_y, List<BigInteger> ls_x, List<BigInteger> ls_y, List<BigInteger> rs_x, List<BigInteger> rs_y, BigInteger A, BigInteger B) {
        Function function = new Function("verify", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(c_x), 
                new org.web3j.abi.datatypes.generated.Uint256(c_y), 
                new org.web3j.abi.datatypes.generated.StaticArray4<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(ls_x, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.StaticArray4<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(ls_y, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.StaticArray4<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(rs_x, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.StaticArray4<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(rs_y, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.Uint256(A), 
                new org.web3j.abi.datatypes.generated.Uint256(B)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public static EfficientInnerProductVerifier load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new EfficientInnerProductVerifier(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static EfficientInnerProductVerifier load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new EfficientInnerProductVerifier(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}