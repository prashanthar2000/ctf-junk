Set-StrictMode -Version Latest

InModuleScope Pester {
    Describe "PesterThrow" {
        It "returns true if the statement throws an exception" {
            Test-PositiveAssertion (PesterThrow { throw })
        }

        It "returns false if the statement does not throw an exception" {
            Test-NegativeAssertion (PesterThrow { 1 + 1 })
        }

        It "returns true if the statement throws an exception and the actual error text matches the expected error text" {
            $expectedErrorMessage = "expected error message"
            Test-PositiveAssertion (PesterThrow { throw $expectedErrorMessage } $expectedErrorMessage)
        }

        It "returns false if the statement throws an exception and the actual error does not match the expected error text" {
            $unexpectedErrorMessage = "unexpected error message"
            $expectedErrorMessage = "some expected error message"
            Test-NegativeAssertion (PesterThrow { throw $unexpectedErrorMessage} $expectedErrorMessage)
        }

        It "returns true if the statement throws an exception and the actual error text matches the expected error pattern" {
            Test-PositiveAssertion (PesterThrow { throw "expected error"} "error")
        }
    }

    Describe "Get-DoMessagesMatch" {
        It "returns true if the actual message is the same as the expected message" {
            $expectedErrorMessage = "expected"
            $actualErrorMesage = "expected"
            $result = Get-DoMessagesMatch $actualErrorMesage $expectedErrorMessage
            $result | Should Be $True
        }

        It "returns false if the actual message is not the same as the expected message" {
            $expectedErrorMessage = "some expected message"
            $actualErrorMesage = "unexpected"
            $result = Get-DoMessagesMatch $actualErrorMesage $expectedErrorMessage
            $result | Should Be $False
        }

        It "returns false is there's no expectation" {
            $result = Get-DoMessagesMatch "" ""
            $result | Should Be $False
        }

        It "returns true if the expected error is contained in the actual message" {
            $actualErrorMesage = "this is a long error message"
            $expectedText = "long error"
            $result = Get-DoMessagesMatch $actualErrorMesage $expectedText
            $result | Should Be $True
        }
    }

    Describe 'PesterThrowFailureMessage' {
        $testScriptPath = Join-Path $TestDrive.FullName test.ps1

        It 'returns false if the actual message is not the same as the expected message' {
            $unexpectedErrorMessage = 'unexpected'
            $expectedErrorMessage = 'some expected message'
            Set-Content -Path $testScriptPath -Value "throw '$unexpectedErrorMessage'"

            PesterThrow { & $testScriptPath } $expectedErrorMessage > $null
            $result = PesterThrowFailureMessage $unexpectedErrorMessage $expectedErrorMessage
            $result | Should Match "^Expected: the expression to throw an exception with message {$expectedErrorMessage}, an exception was raised, message was {$unexpectedErrorMessage}`n    from $([RegEx]::Escape($testScriptPath)):\d+ char:\d+"
        }

        It 'returns true if the actual message is the same as the expected message' {
            PesterThrow { } > $null
            $result = PesterThrowFailureMessage 'error message'
            $result | Should Be 'Expected: the expression to throw an exception'
        }
    }

    Describe 'NotPesterThrowFailureMessage' {
        $testScriptPath = Join-Path $TestDrive.FullName test.ps1

        It 'returns false if the actual message is not the same as the expected message' {
            $unexpectedErrorMessage = 'unexpected'
            $expectedErrorMessage = 'some expected message'
            Set-Content -Path $testScriptPath -Value "throw '$unexpectedErrorMessage'"

            PesterThrow { & $testScriptPath } $expectedErrorMessage > $null
            $result = NotPesterThrowFailureMessage $unexpectedErrorMessage $expectedErrorMessage
            $result | Should Match "^Expected: the expression not to throw an exception with message {$expectedErrorMessage}, an exception was raised, message was {$unexpectedErrorMessage}`n    from $([RegEx]::Escape($testScriptPath)):\d+ char:\d+"
        }

        It 'returns true if the actual message is the same as the expected message' {
            Set-Content -Path $testScriptPath -Value "throw 'error message'"
            PesterThrow { & $testScriptPath } > $null
            $result = NotPesterThrowFailureMessage 'error message'
            $result | Should Match "^Expected: the expression not to throw an exception. Message was {error message}`n    from $([RegEx]::Escape($testScriptPath)):\d+ char:\d+"
        }
    }
}

# SIG # Begin signature block
# MIIatwYJKoZIhvcNAQcCoIIaqDCCGqQCAQExCzAJBgUrDgMCGgUAMGkGCisGAQQB
# gjcCAQSgWzBZMDQGCisGAQQBgjcCAR4wJgIDAQAABBAfzDtgWUsITrck0sYpfvNR
# AgEAAgEAAgEAAgEAAgEAMCEwCQYFKw4DAhoFAAQUnF+eUb/MQqU9P3E/MTg/h5MY
# StGgghV6MIIEuzCCA6OgAwIBAgITMwAAAFwJq3ADEfxcFQAAAAAAXDANBgkqhkiG
# 9w0BAQUFADB3MQswCQYDVQQGEwJVUzETMBEGA1UECBMKV2FzaGluZ3RvbjEQMA4G
# A1UEBxMHUmVkbW9uZDEeMBwGA1UEChMVTWljcm9zb2Z0IENvcnBvcmF0aW9uMSEw
# HwYDVQQDExhNaWNyb3NvZnQgVGltZS1TdGFtcCBQQ0EwHhcNMTQwNTIzMTcxMzE2
# WhcNMTUwODIzMTcxMzE2WjCBqzELMAkGA1UEBhMCVVMxCzAJBgNVBAgTAldBMRAw
# DgYDVQQHEwdSZWRtb25kMR4wHAYDVQQKExVNaWNyb3NvZnQgQ29ycG9yYXRpb24x
# DTALBgNVBAsTBE1PUFIxJzAlBgNVBAsTHm5DaXBoZXIgRFNFIEVTTjpCQkVDLTMw
# Q0EtMkRCRTElMCMGA1UEAxMcTWljcm9zb2Z0IFRpbWUtU3RhbXAgU2VydmljZTCC
# ASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBANYJa/7h+ToIHrYOs0PLI95O
# bOJZcc75TxmjL8QLy/H1Xyl5ielMpmU8xUtMXQHp/i9QvCCDC5hHW5nqTZ/eqcsj
# lYzk07XcemMgs/L/r8dp/5K7jQpF7punPfdkmj6O6rRaABbNqeXVTJUmQH8DmFyk
# 6dBH1jblvqVRQb9b9uyuNN9K8gXa/fw9YY6yEa11unZrY2JOJSHPpz88ub9uBEMk
# HrvplbnGydEgydhVI1Xnsr+vLVxathcwcTMQJH5xnrFl4ma2BdMyV0nEYhPYkoyB
# kY8zQ5EZbBL0eRTm5Z/F5anhM0C22y9X05U2It3yQqmUtGTTgSMUlMPZRhdm3r0C
# AwEAAaOCAQkwggEFMB0GA1UdDgQWBBR/kUhDg4fJeBzpVcW521b4F9FHBDAfBgNV
# HSMEGDAWgBQjNPjZUkZwCu1A+3b7syuwwzWzDzBUBgNVHR8ETTBLMEmgR6BFhkNo
# dHRwOi8vY3JsLm1pY3Jvc29mdC5jb20vcGtpL2NybC9wcm9kdWN0cy9NaWNyb3Nv
# ZnRUaW1lU3RhbXBQQ0EuY3JsMFgGCCsGAQUFBwEBBEwwSjBIBggrBgEFBQcwAoY8
# aHR0cDovL3d3dy5taWNyb3NvZnQuY29tL3BraS9jZXJ0cy9NaWNyb3NvZnRUaW1l
# U3RhbXBQQ0EuY3J0MBMGA1UdJQQMMAoGCCsGAQUFBwMIMA0GCSqGSIb3DQEBBQUA
# A4IBAQCCCVb4b+5GzEwp9r7Tx2pf+V2EABkXgYloZBU/wUQ2OxhtBMusE7eOlOMt
# 66P0QnxE0QnsWr7nk9OEcuKP1R3VOVP7ciILZpI7ysqr+s/MZE7GRGyv4IOOFBG4
# sJBJn8OmlM+D4BFiWqtYo7hhlyR2rG1D947qHfOI/ipL7h/0HW2sIEyIAEAutLlI
# 2tHEbsGt9DOFYQuJLF5rygNjUkox7r1VwxCnUaiSrxJgxZxdRmPTzOqfNcatCSB0
# hTUbRRKzllHhye2bgOV25fdWhesgnCiRVPtoulaFg1Vh/4hAXLENJgejxVfsFXkP
# lvSOdqGKZ1qNf05i9H7fEKDWFLqXMIIE7DCCA9SgAwIBAgITMwAAAMps1TISNcTh
# VQABAAAAyjANBgkqhkiG9w0BAQUFADB5MQswCQYDVQQGEwJVUzETMBEGA1UECBMK
# V2FzaGluZ3RvbjEQMA4GA1UEBxMHUmVkbW9uZDEeMBwGA1UEChMVTWljcm9zb2Z0
# IENvcnBvcmF0aW9uMSMwIQYDVQQDExpNaWNyb3NvZnQgQ29kZSBTaWduaW5nIFBD
# QTAeFw0xNDA0MjIxNzM5MDBaFw0xNTA3MjIxNzM5MDBaMIGDMQswCQYDVQQGEwJV
# UzETMBEGA1UECBMKV2FzaGluZ3RvbjEQMA4GA1UEBxMHUmVkbW9uZDEeMBwGA1UE
# ChMVTWljcm9zb2Z0IENvcnBvcmF0aW9uMQ0wCwYDVQQLEwRNT1BSMR4wHAYDVQQD
# ExVNaWNyb3NvZnQgQ29ycG9yYXRpb24wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAw
# ggEKAoIBAQCWcV3tBkb6hMudW7dGx7DhtBE5A62xFXNgnOuntm4aPD//ZeM08aal
# IV5WmWxY5JKhClzC09xSLwxlmiBhQFMxnGyPIX26+f4TUFJglTpbuVildGFBqZTg
# rSZOTKGXcEknXnxnyk8ecYRGvB1LtuIPxcYnyQfmegqlFwAZTHBFOC2BtFCqxWfR
# +nm8xcyhcpv0JTSY+FTfEjk4Ei+ka6Wafsdi0dzP7T00+LnfNTC67HkyqeGprFVN
# TH9MVsMTC3bxB/nMR6z7iNVSpR4o+j0tz8+EmIZxZRHPhckJRIbhb+ex/KxARKWp
# iyM/gkmd1ZZZUBNZGHP/QwytK9R/MEBnAgMBAAGjggFgMIIBXDATBgNVHSUEDDAK
# BggrBgEFBQcDAzAdBgNVHQ4EFgQUH17iXVCNVoa+SjzPBOinh7XLv4MwUQYDVR0R
# BEowSKRGMEQxDTALBgNVBAsTBE1PUFIxMzAxBgNVBAUTKjMxNTk1K2I0MjE4ZjEz
# LTZmY2EtNDkwZi05YzQ3LTNmYzU1N2RmYzQ0MDAfBgNVHSMEGDAWgBTLEejK0rQW
# WAHJNy4zFha5TJoKHzBWBgNVHR8ETzBNMEugSaBHhkVodHRwOi8vY3JsLm1pY3Jv
# c29mdC5jb20vcGtpL2NybC9wcm9kdWN0cy9NaWNDb2RTaWdQQ0FfMDgtMzEtMjAx
# MC5jcmwwWgYIKwYBBQUHAQEETjBMMEoGCCsGAQUFBzAChj5odHRwOi8vd3d3Lm1p
# Y3Jvc29mdC5jb20vcGtpL2NlcnRzL01pY0NvZFNpZ1BDQV8wOC0zMS0yMDEwLmNy
# dDANBgkqhkiG9w0BAQUFAAOCAQEAd1zr15E9zb17g9mFqbBDnXN8F8kP7Tbbx7Us
# G177VAU6g3FAgQmit3EmXtZ9tmw7yapfXQMYKh0nfgfpxWUftc8Nt1THKDhaiOd7
# wRm2VjK64szLk9uvbg9dRPXUsO8b1U7Brw7vIJvy4f4nXejF/2H2GdIoCiKd381w
# gp4YctgjzHosQ+7/6sDg5h2qnpczAFJvB7jTiGzepAY1p8JThmURdwmPNVm52Iao
# AP74MX0s9IwFncDB1XdybOlNWSaD8cKyiFeTNQB8UCu8Wfz+HCk4gtPeUpdFKRhO
# lludul8bo/EnUOoHlehtNA04V9w3KDWVOjic1O1qhV0OIhFeezCCBbwwggOkoAMC
# AQICCmEzJhoAAAAAADEwDQYJKoZIhvcNAQEFBQAwXzETMBEGCgmSJomT8ixkARkW
# A2NvbTEZMBcGCgmSJomT8ixkARkWCW1pY3Jvc29mdDEtMCsGA1UEAxMkTWljcm9z
# b2Z0IFJvb3QgQ2VydGlmaWNhdGUgQXV0aG9yaXR5MB4XDTEwMDgzMTIyMTkzMloX
# DTIwMDgzMTIyMjkzMloweTELMAkGA1UEBhMCVVMxEzARBgNVBAgTCldhc2hpbmd0
# b24xEDAOBgNVBAcTB1JlZG1vbmQxHjAcBgNVBAoTFU1pY3Jvc29mdCBDb3Jwb3Jh
# dGlvbjEjMCEGA1UEAxMaTWljcm9zb2Z0IENvZGUgU2lnbmluZyBQQ0EwggEiMA0G
# CSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCycllcGTBkvx2aYCAgQpl2U2w+G9Zv
# zMvx6mv+lxYQ4N86dIMaty+gMuz/3sJCTiPVcgDbNVcKicquIEn08GisTUuNpb15
# S3GbRwfa/SXfnXWIz6pzRH/XgdvzvfI2pMlcRdyvrT3gKGiXGqelcnNW8ReU5P01
# lHKg1nZfHndFg4U4FtBzWwW6Z1KNpbJpL9oZC/6SdCnidi9U3RQwWfjSjWL9y8lf
# RjFQuScT5EAwz3IpECgixzdOPaAyPZDNoTgGhVxOVoIoKgUyt0vXT2Pn0i1i8UU9
# 56wIAPZGoZ7RW4wmU+h6qkryRs83PDietHdcpReejcsRj1Y8wawJXwPTAgMBAAGj
# ggFeMIIBWjAPBgNVHRMBAf8EBTADAQH/MB0GA1UdDgQWBBTLEejK0rQWWAHJNy4z
# Fha5TJoKHzALBgNVHQ8EBAMCAYYwEgYJKwYBBAGCNxUBBAUCAwEAATAjBgkrBgEE
# AYI3FQIEFgQU/dExTtMmipXhmGA7qDFvpjy82C0wGQYJKwYBBAGCNxQCBAweCgBT
# AHUAYgBDAEEwHwYDVR0jBBgwFoAUDqyCYEBWJ5flJRP8KuEKU5VZ5KQwUAYDVR0f
# BEkwRzBFoEOgQYY/aHR0cDovL2NybC5taWNyb3NvZnQuY29tL3BraS9jcmwvcHJv
# ZHVjdHMvbWljcm9zb2Z0cm9vdGNlcnQuY3JsMFQGCCsGAQUFBwEBBEgwRjBEBggr
# BgEFBQcwAoY4aHR0cDovL3d3dy5taWNyb3NvZnQuY29tL3BraS9jZXJ0cy9NaWNy
# b3NvZnRSb290Q2VydC5jcnQwDQYJKoZIhvcNAQEFBQADggIBAFk5Pn8mRq/rb0Cx
# MrVq6w4vbqhJ9+tfde1MOy3XQ60L/svpLTGjI8x8UJiAIV2sPS9MuqKoVpzjcLu4
# tPh5tUly9z7qQX/K4QwXaculnCAt+gtQxFbNLeNK0rxw56gNogOlVuC4iktX8pVC
# nPHz7+7jhh80PLhWmvBTI4UqpIIck+KUBx3y4k74jKHK6BOlkU7IG9KPcpUqcW2b
# Gvgc8FPWZ8wi/1wdzaKMvSeyeWNWRKJRzfnpo1hW3ZsCRUQvX/TartSCMm78pJUT
# 5Otp56miLL7IKxAOZY6Z2/Wi+hImCWU4lPF6H0q70eFW6NB4lhhcyTUWX92THUmO
# Lb6tNEQc7hAVGgBd3TVbIc6YxwnuhQ6MT20OE049fClInHLR82zKwexwo1eSV32U
# jaAbSANa98+jZwp0pTbtLS8XyOZyNxL0b7E8Z4L5UrKNMxZlHg6K3RDeZPRvzkbU
# 0xfpecQEtNP7LN8fip6sCvsTJ0Ct5PnhqX9GuwdgR2VgQE6wQuxO7bN2edgKNAlt
# HIAxH+IOVN3lofvlRxCtZJj/UBYufL8FIXrilUEnacOTj5XJjdibIa4NXJzwoq6G
# aIMMai27dmsAHZat8hZ79haDJLmIz2qoRzEvmtzjcT3XAH5iR9HOiMm4GPoOco3B
# oz2vAkBq/2mbluIQqBC0N1AI1sM9MIIGBzCCA++gAwIBAgIKYRZoNAAAAAAAHDAN
# BgkqhkiG9w0BAQUFADBfMRMwEQYKCZImiZPyLGQBGRYDY29tMRkwFwYKCZImiZPy
# LGQBGRYJbWljcm9zb2Z0MS0wKwYDVQQDEyRNaWNyb3NvZnQgUm9vdCBDZXJ0aWZp
# Y2F0ZSBBdXRob3JpdHkwHhcNMDcwNDAzMTI1MzA5WhcNMjEwNDAzMTMwMzA5WjB3
# MQswCQYDVQQGEwJVUzETMBEGA1UECBMKV2FzaGluZ3RvbjEQMA4GA1UEBxMHUmVk
# bW9uZDEeMBwGA1UEChMVTWljcm9zb2Z0IENvcnBvcmF0aW9uMSEwHwYDVQQDExhN
# aWNyb3NvZnQgVGltZS1TdGFtcCBQQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAw
# ggEKAoIBAQCfoWyx39tIkip8ay4Z4b3i48WZUSNQrc7dGE4kD+7Rp9FMrXQwIBHr
# B9VUlRVJlBtCkq6YXDAm2gBr6Hu97IkHD/cOBJjwicwfyzMkh53y9GccLPx754gd
# 6udOo6HBI1PKjfpFzwnQXq/QsEIEovmmbJNn1yjcRlOwhtDlKEYuJ6yGT1VSDOQD
# LPtqkJAwbofzWTCd+n7Wl7PoIZd++NIT8wi3U21StEWQn0gASkdmEScpZqiX5NMG
# gUqi+YSnEUcUCYKfhO1VeP4Bmh1QCIUAEDBG7bfeI0a7xC1Un68eeEExd8yb3zuD
# k6FhArUdDbH895uyAc4iS1T/+QXDwiALAgMBAAGjggGrMIIBpzAPBgNVHRMBAf8E
# BTADAQH/MB0GA1UdDgQWBBQjNPjZUkZwCu1A+3b7syuwwzWzDzALBgNVHQ8EBAMC
# AYYwEAYJKwYBBAGCNxUBBAMCAQAwgZgGA1UdIwSBkDCBjYAUDqyCYEBWJ5flJRP8
# KuEKU5VZ5KShY6RhMF8xEzARBgoJkiaJk/IsZAEZFgNjb20xGTAXBgoJkiaJk/Is
# ZAEZFgltaWNyb3NvZnQxLTArBgNVBAMTJE1pY3Jvc29mdCBSb290IENlcnRpZmlj
# YXRlIEF1dGhvcml0eYIQea0WoUqgpa1Mc1j0BxMuZTBQBgNVHR8ESTBHMEWgQ6BB
# hj9odHRwOi8vY3JsLm1pY3Jvc29mdC5jb20vcGtpL2NybC9wcm9kdWN0cy9taWNy
# b3NvZnRyb290Y2VydC5jcmwwVAYIKwYBBQUHAQEESDBGMEQGCCsGAQUFBzAChjho
# dHRwOi8vd3d3Lm1pY3Jvc29mdC5jb20vcGtpL2NlcnRzL01pY3Jvc29mdFJvb3RD
# ZXJ0LmNydDATBgNVHSUEDDAKBggrBgEFBQcDCDANBgkqhkiG9w0BAQUFAAOCAgEA
# EJeKw1wDRDbd6bStd9vOeVFNAbEudHFbbQwTq86+e4+4LtQSooxtYrhXAstOIBNQ
# md16QOJXu69YmhzhHQGGrLt48ovQ7DsB7uK+jwoFyI1I4vBTFd1Pq5Lk541q1YDB
# 5pTyBi+FA+mRKiQicPv2/OR4mS4N9wficLwYTp2OawpylbihOZxnLcVRDupiXD8W
# mIsgP+IHGjL5zDFKdjE9K3ILyOpwPf+FChPfwgphjvDXuBfrTot/xTUrXqO/67x9
# C0J71FNyIe4wyrt4ZVxbARcKFA7S2hSY9Ty5ZlizLS/n+YWGzFFW6J1wlGysOUzU
# 9nm/qhh6YinvopspNAZ3GmLJPR5tH4LwC8csu89Ds+X57H2146SodDW4TsVxIxIm
# dgs8UoxxWkZDFLyzs7BNZ8ifQv+AeSGAnhUwZuhCEl4ayJ4iIdBD6Svpu/RIzCzU
# 2DKATCYqSCRfWupW76bemZ3KOm+9gSd0BhHudiG/m4LBJ1S2sWo9iaF2YbRuoROm
# v6pH8BJv/YoybLL+31HIjCPJZr2dHYcSZAI9La9Zj7jkIeW1sMpjtHhUBdRBLlCs
# lLCleKuzoJZ1GtmShxN1Ii8yqAhuoFuMJb+g74TKIdbrHk/Jmu5J4PcBZW+JC33I
# acjmbuqnl84xKf8OxVtc2E0bodj6L54/LlUWa8kTo/0xggSnMIIEowIBATCBkDB5
# MQswCQYDVQQGEwJVUzETMBEGA1UECBMKV2FzaGluZ3RvbjEQMA4GA1UEBxMHUmVk
# bW9uZDEeMBwGA1UEChMVTWljcm9zb2Z0IENvcnBvcmF0aW9uMSMwIQYDVQQDExpN
# aWNyb3NvZnQgQ29kZSBTaWduaW5nIFBDQQITMwAAAMps1TISNcThVQABAAAAyjAJ
# BgUrDgMCGgUAoIHAMBkGCSqGSIb3DQEJAzEMBgorBgEEAYI3AgEEMBwGCisGAQQB
# gjcCAQsxDjAMBgorBgEEAYI3AgEVMCMGCSqGSIb3DQEJBDEWBBQosD8eLuSgUi9b
# JW4tacFb1T+TSDBgBgorBgEEAYI3AgEMMVIwUKAmgCQAVwBpAG4AZABvAHcAcwAg
# AFAAbwB3AGUAcgBTAGgAZQBsAGyhJoAkaHR0cDovL3d3dy5taWNyb3NvZnQuY29t
# L3Bvd2Vyc2hlbGwgMA0GCSqGSIb3DQEBAQUABIIBADC4TxhPQjFJ3f8ol8LuBaBl
# 6TTkFpIB67AaqQjIt7skHlU22Cr7x6KLK1EUXkIff4or9rWZ/07JwYdj/Gw70I0N
# 1T4aWLfikho7XFLlaSTjwnwLkvpyH1N84UhRo6J2rPV1sgGiGJZRDPLXFsaNc37Z
# N6GvbL/790AGtiomTUy6uAFLMnWN3ivgFO6UvHPGuRHsJ/bB5Euq3ZlBpq3t3Hth
# cN7mUbvKVpy5NaZzfbVXrGPbD3FhskZIBi/kcjboJn12L7va4jwpjxyZTuAWX4Gk
# Q8fECKuD/9cWkztusC0yGuO/a3c4Ntv2+JlOsgCOBTakntrIkOig9Y/YYoyegCWh
# ggIoMIICJAYJKoZIhvcNAQkGMYICFTCCAhECAQEwgY4wdzELMAkGA1UEBhMCVVMx
# EzARBgNVBAgTCldhc2hpbmd0b24xEDAOBgNVBAcTB1JlZG1vbmQxHjAcBgNVBAoT
# FU1pY3Jvc29mdCBDb3Jwb3JhdGlvbjEhMB8GA1UEAxMYTWljcm9zb2Z0IFRpbWUt
# U3RhbXAgUENBAhMzAAAAXAmrcAMR/FwVAAAAAABcMAkGBSsOAwIaBQCgXTAYBgkq
# hkiG9w0BCQMxCwYJKoZIhvcNAQcBMBwGCSqGSIb3DQEJBTEPFw0xNTAzMDYwMDAx
# MzJaMCMGCSqGSIb3DQEJBDEWBBSGEWubChXolh8WDPh82sjeNC3cbjANBgkqhkiG
# 9w0BAQUFAASCAQC5hEJctG6gKT2rl8InvhdQgB2xmurf3s9Qw92jcYTSxemqzYbH
# 6YXey3a1Grpg2hdjw7YlNKI1AlSnE63h9IkSm77N6tdB3De1oOdXWGaJpqhUxX1E
# 5cJRZ275GBIxDJl91M0UVQ+iPQ6X2aNYV0/OMdcM14DqRQdXBZfPZB/axY85CxJB
# BLexnTBFtFartv6TERJ4tS9+3OFWTmtgp0eiohSxFxxQqFFeuBAgaeAezyHLesAx
# k4ynbNo5x4iOiCXoGhlXoNGPWdAYm1a8BZdIaJDA7Frw3i90Yx7c0wrM086z4B88
# 6GAsVxVt1L9/BvGUsXGw3KoUV/TfoJabERyW
# SIG # End signature block
