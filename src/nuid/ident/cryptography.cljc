(ns nuid.ident.cryptography)

(def hash-algorithms
  #{:nuid.cryptography.hash.algorithm/sha256
    :nuid.cryptography.hash.algorithm/sha512
    :nuid.cryptography.hash.algorithm/scrypt})

(def string-normalization-forms
  #{:string.normalization/NFC
    :string.normalization/NFD
    :string.normalization/NFKC
    :string.normalization/NFKD})
