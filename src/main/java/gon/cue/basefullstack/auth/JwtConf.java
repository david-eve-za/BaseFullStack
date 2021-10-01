package gon.cue.basefullstack.auth;

public class JwtConf {
    public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEogIBAAKCAQEAstMVhud9D2y22ZWtxUY0ic7SvucdjDNsN9T3gev3pdlzcMvi\n" +
            "+BbVYXBStO+oprjpKr7iQhzi3U4lzGxIHtWNUbAOBeUEi+yquvdiVXls+YhsXIWg\n" +
            "+6ha1HmyTvQCQ9mhjuMQwJoTqhap0p9BdkIegaLtnsTX1/KhW5GMxKeJoRWGz3yi\n" +
            "ldrAI9kTTTxidU0398n58PBp3TUSTBnXIOSWYxVne8roXlUEUAw9MEzkZOsj7naS\n" +
            "MDt70VYEn+6d8RKucUerlVFHFlIcDb0/RTMSxd3xuKcZKZFj8AI3nyBxSg69w1p4\n" +
            "FGyHA0SrLRwrJxWtJbWyY1miw4xTMdo+DQBFxwIDAQABAoIBADpRhrq5Mdre7H7n\n" +
            "RoWIkMfEkIw7mTJI7ukCZjmTt+75jKFjjMC1yZ7+X6qsYgcFVN1g5S8EdqQPwVn6\n" +
            "kkakBHN4hAo+Fw5+/2r8FLClafmzGQvPdKG91OloStNe1oJELmEIAkWduf4FaBrN\n" +
            "Xy7u/z3t4aqerXm6og7X192mecbzT6N1qLaa+7OQSNpzJ9XSmPaoh6O+lTnYJOJU\n" +
            "ZdK4Zw3wZvMGI511uXpiB6BgeBaSq6QuZ7AjrTivgF24sXv/C1xg4oGEoBi+GVLM\n" +
            "Xx/sJAHjfy89TKbA6xyVMB+uqIRNzwzgSm3JZLVxC8TZV0pjj/qON/8Fznm6Zadz\n" +
            "pTgZUTkCgYEA3QrGc7pOEJxlFD4PPkKP3wAc+SilBWPRFVZQbN+3wDXOcBkIWMB/\n" +
            "Jvc5+GMTmofbXxFveYYeM08oJIR5fJ9S24yHnuPruTpzlmcLiTp0+Ho1fNadL6+5\n" +
            "ptqAiJWPsEBPvN8pixNzHyOTqSMzwqpAxYW8Z9h1bFzFY1nN3aFTqw0CgYEAzxsR\n" +
            "SJg24rEBB3JmVOZgXfJ4t3m0uZhDxXMbO6v6VElJo4M7Bn0DKkdT6mOOG/bgYe3b\n" +
            "GozrmGVHvydi+z7wHR1OW727cGa2dK4Qa4BDz5ohTIuNwI80RKdnWSWJOsrJiiXf\n" +
            "div9B3FtakUpDN+KuOkMLGdYCwwz+kEgGI6qryMCgYBIb/CLGmHc1bPWR2QtbhjB\n" +
            "5sKX8Hbr5kMtr+SZWVNZXQiy+bEfjK3esiRAPw+8k4sTg545f/dDr0wjc3pwmbHI\n" +
            "mywSqPSl9f7NKiXAqfSNPVdr+tT2PKslf/OhTwoQo3K+HY/6sLwIV1tbkVq0D6E8\n" +
            "WdBdY7VPdrOFFHf/io/lvQKBgAj7+Jz4lXDyEsRa7xuBvu50ZU44RmHCvDXlj2ng\n" +
            "RQTBBSPFvprCc4+y9m31kaWe6Q72fYnCUToUMq+VKtMRYOMycULDkU0H96RKJMY1\n" +
            "Ezv/SLCEYUrYK4FK7c3NNg3J3EJU8EO1Fs3q2r9Abs5zKBZrba7DcOtRxTN2/chy\n" +
            "7+6XAoGABHh1v2eEhxleSylQmW4qJMuLO6Ai2qxSNoyJgdEl6Aq45hzW/+4sxHf1\n" +
            "xevF4hjUMTqaCZQfoDPR3l0/L3DgKdF544HNY5Mz/bfJoyWDTVobdqx40cCnjNE2\n" +
            "9OyTQwHlPRT33qKUvgIb5YEfhKsDdRZn2rTqLqNQqBxDhJkEySs=\n" +
            "-----END RSA PRIVATE KEY-----";
    public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAstMVhud9D2y22ZWtxUY0\n" +
            "ic7SvucdjDNsN9T3gev3pdlzcMvi+BbVYXBStO+oprjpKr7iQhzi3U4lzGxIHtWN\n" +
            "UbAOBeUEi+yquvdiVXls+YhsXIWg+6ha1HmyTvQCQ9mhjuMQwJoTqhap0p9BdkIe\n" +
            "gaLtnsTX1/KhW5GMxKeJoRWGz3yildrAI9kTTTxidU0398n58PBp3TUSTBnXIOSW\n" +
            "YxVne8roXlUEUAw9MEzkZOsj7naSMDt70VYEn+6d8RKucUerlVFHFlIcDb0/RTMS\n" +
            "xd3xuKcZKZFj8AI3nyBxSg69w1p4FGyHA0SrLRwrJxWtJbWyY1miw4xTMdo+DQBF\n" +
            "xwIDAQAB\n" +
            "-----END PUBLIC KEY-----";
}
