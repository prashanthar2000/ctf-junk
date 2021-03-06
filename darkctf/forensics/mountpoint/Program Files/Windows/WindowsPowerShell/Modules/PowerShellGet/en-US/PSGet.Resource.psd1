# Localized	07/10/2015 05:32 AM (GMT)	303:4.80.0411 	PSGet.Resource.psd1
#########################################################################################
#
# Copyright (c) Microsoft Corporation. All rights reserved.
#
# Localized PSGet.Resource.psd1
#
#########################################################################################

ConvertFrom-StringData @'
###PSLOC
InstallModulewhatIfMessage=Version '{1}' of module '{0}'
UpdateModulewhatIfMessage=Version '__OLDVERSION__' of module '{0}', updating to version '{1}'
PublishModulewhatIfMessage=Version '{0}' of module '{1}'
VersionRangeAndRequiredVersionCannotBeSpecifiedTogether=You cannot use the parameters RequiredVersion and either MinimumVersion or MaximumVersion in the same command. Specify only one of these parameters in your command.
RequiredVersionAllowedOnlyWithSingleModuleName=The RequiredVersion parameter is allowed only when a single module name is specified as the value of the Name parameter, without any wildcard characters.
MinimumVersionIsGreaterThanMaximumVersion=The specified MinimumVersion '{0}' is greater than the specified MaximumVersion '{1}'.
InstallModuleNeedsCurrentUserScopeParameterForNonAdminUser=Administrator rights are required to install modules in '{0}'. Log on to the computer with an account that has Administrator rights, and then try again, or install '{1}' by adding "-Scope CurrentUser" to your command. You can also try running the Windows PowerShell session with elevated rights (Run as Administrator).
VersionParametersAreAllowedOnlyWithSingleModule=The RequiredVersion, MinimumVersion, or MaximumVersion parameters are allowed only when you specify a single module name as the value of the Name parameter, without any wildcard characters.
PathIsNotADirectory=The specified path '{0}' is not a valid directory.
ModuleAlreadyInstalled=Version '{0}' of module '{1}' is already installed at '{2}'. To delete version '{3}' and install version '{4}', run Install-Module, and add the -Force parameter.
ModuleAlreadyInstalledVerbose=Version '{0}' of module '{1}' is already installed at '{2}'.
ModuleWithRequiredVersionAlreadyInstalled=Version '{0}' of module '{1}' is already installed at '{2}'. To reinstall this version '{3}', run Install-Module or Updated-Module cmdlet with the -Force parameter.
InvalidPSModule=The module '{0}' cannot be installed or updated because it is not a properly-formed module.
InvalidAuthenticodeSignature=The module '{0}' cannot be installed or updated because the Authenticode signature for the file '{1}' is not valid.
ModuleNotInstalledOnThiseMachine=Module '{0}' was not updated because no valid module was found in the module directory. Verify that the module is located in the folder specified by $env:PSModulePath.
AdminPrivilegesRequiredForUpdate=Module '{0}' (installed at'{1}') cannot be updated because Administrator rights are required to change that directory. Log on to the computer with an account that has Administrator rights, and then try again. You can also try running the Windows PowerShell session with elevated rights (Run as Administrator).
ModuleNotInstalledUsingPowerShellGet=Module '{0}' was not installed by using Install-Module, so it cannot be updated.
DownloadingModuleFromGallery=Downloading module '{0}' with version '{1}' from the repository '{2}'.
NoUpdateAvailable=No updates were found for module '{0}'.
FoundModuleUpdate=An update for the module '{0}' was found with version '{1}'.
InvalidPSModuleDuringUpdate=Module '{0}' was not updated because the module in the repository '{1}' is not a valid Windows PowerShell module.
ModuleGotUpdated=Module '{0}' has been updated successfully.
TestingModuleInUse=Testing if the module to update is in use.
ModuleDestination=The specified module will be installed in '{0}'.
ModuleIsInUse=Module '{0}' is in currently in use.
ModuleInstalledSuccessfully=Module '{0}' was installed successfully.
ModuleSavedSuccessfully=Module '{0}' was saved successfully.
CheckingForModuleUpdate=Checking for updates for module '{0}'.
ModuleInUseWithProcessDetails=The version '{0}' of module '{1}' is currently in use. Retry the operation after closing the following applications: '{2}'.
ModuleNotAvailableLocally=The specified module '{0}' was not published because no module with that name was found in any module directory.
AmbiguousModuleName=Modules with the name '{0}' are available under multiple paths. Add the -RequiredVersion parameter or the -Path parameter to specify the module to publish.
PublishModuleLocation=Module'{0}' was found in '{1}'.
InvalidModuleToPublish=Module '{0}' cannot be published because it does not have a module manifest file. Run New-ModuleManifest -Path <PathName> to create a module manifest with metadata before publishing.
MissingRequiredManifestKeys=Module '{0}' cannot be published because it is missing required metadata. Verify that the module manifest specifies Description and Author.
ModuleVersionShouldBeGreaterThanGalleryVersion=Module '{0}' with version '{1}' cannot be published. The version must exceed the current version '{2}' that exists in the repository '{3}'.
CouldNotInstallNuGetBinaries=NuGet-anycpu.exe is required to interact with NuGet based galleries.  Please ensure that NuGet-anycpu.exe is available under '{0}' or '{1}'.
InstallNuGetBinariesShouldContinueQuery=PowerShellGet requires NuGet-anycpu.exe to interact with NuGet based galleries. NuGet-anycpu.exe must be available in '{0}' or '{1}'. For more information about NuGet provider, see http://OneGet.org/NuGet.html. Do you want PowerShellGet to download NuGet-anycpu.exe now?
InstallNuGetBinariesShouldContinueCaption=NuGet-anycpu.exe is required to continue.
DownloadingNugetBinaries=Downloading NuGet-anycpu.exe.
ModuleNotFound=Module '{0}' was not found.
NoMatchFound=No match was found for the specified search criteria and module names '{0}'.
FailedToCreateCompressedModule=Failed to generate the compressed module file for module '{0}'.
FailedToPublish=Failed to publish module '{0}'.
PublishedSuccessfully=Successfully published module '{0}' to the module publish location '{1}'. Please allow few minutes for '{2}' to show up in the search results.
InvalidWebUri=The specified Uri '{0}' for parameter '{1}' is an invalid Web Uri. Please ensure that it meets the Web Uri requirements.
RepositoryAlreadyRegistered=The repository could not be registered because there exists a registered repository with Name '{0}' and SourceLocation '{1}'. To register another repository with Name '{2}', please unregister the existing repository using the Unregister-PSRepository cmdlet.
RepositoryToBeUnregisteredNotFound=The repository '{0}' was not removed because no repository was found with that name. Please run Get-PSRepository and ensure that a repository of that name is present.
RepositoryCannotBeUnregistered=The specified repository '{0}' cannot be unregistered.
RepositoryNotFound=No repository with the name '{0}' was found.
RepositoryNameContainsWildCards=The repository name '{0}' should not have wildcards, correct it and try again.
InvalidRepository=The specified repository '{0}' is not a valid registered repository name. Please ensure that '{1}' is a registered repository.
RepositoryRegistered=Successfully registered the repository '{0}' with source location '{1}'.
RepositoryUnregistered=Successfully unregistered the repository '{0}'.
PSGalleryPublishLocationIsMissing=The specified repository '{0}' does not have a valid PublishLocation. Retry after setting the PublishLocation for repository '{1}' to a valid NuGet publishing endpoint using the Set-PSRepository cmdlet.
PublishModuleSupportsOnlyNuGetBasedPublishLocations=Publish-Module only supports the NuGet-based publish locations. The PublishLocation '{0}' of the repository '{1}' is not a NuGet-based publish location. Retry after setting the PublishLocation for repository '{1}' to a valid NuGet publishing endpoint using the Set-PSRepository cmdlet.
DynamicParameterHelpMessage=The dynamic parameter '{0}' is required for Find-Module and Install-Module when using the PackageManagement provider '{1}' and source location '{2}'. Please enter your value for the '{3}' dynamic parameter:
ProviderApiDebugMessage=In PSModule Provider - '{0}'.
ModuleUninstallNotSupported=Module uninstallation is not supported. To remove a module, please delete the module folder.
FastPackageReference=The FastPackageReference is '{0}'.
PackageManagementProviderIsNotAvailable=The specified PackageManagement provider '{0}' is not available.
SpecifiedSourceName=Using the specified source names : '{0}'.
SpecifiedLocationAndOGP=The specified Location is '{0}' and PackageManagementProvider is '{1}'.
NoSourceNameIsSpecified=The -Repository parameter was not specified.  PowerShellGet will use all of the registered repositories.
GettingPackageManagementProviderObject=Getting the provider object for the PackageManagement Provider '{0}'.
InvalidInputObjectValue=Invalid value is specified for InputObject parameter.
SpecifiedInstallationScope=The installation scope is specified to be '{0}'.
SourceLocationValueForPSGalleryCannotBeChanged=The SourceLocation value for the PSGallery repository can not be changed.
PublishLocationValueForPSGalleryCannotBeChanged=The PublishLocation value for the PSGallery repository can not be changed.
SpecifiedProviderName=The specified PackageManagement provider name '{0}'.
ProviderNameNotSpecified=User did not specify the PackageManagement provider name, trying with the provider name '{0}'.
SpecifiedProviderNotAvailable=The specified PackageManagement provider '{0}' is not available.
SpecifiedProviderDoesnotSupportPSModules=The specified PackageManagement Provider '{0}' does not support PowerShell Modules. PackageManagement Providers must support the 'supports-powershell-modules' feature.
PollingPackageManagementProvidersForLocation=Polling available PackageManagement Providers to find one that can support the specified source location '{0}'.
PollingSingleProviderForLocation=Resolving the source location '{0}' with PackageManagement Provider '{1}'.
FoundProviderForLocation=The PackageManagement provider '{0}' supports the source location '{1}'.
SpecifiedLocationCannotBeRegistered=The specified location '{0}' cannot be registered.
RepositoryDetails=Repository details, Name = '{0}', Location = '{1}'; IsTrusted = '{2}'; IsRegistered = '{3}'.
NotSupportedPowerShellGetFormatVersion=The specified module '{0}' with PowerShellGetFormatVersion '{1}' is not supported by the current version of PowerShellGet. Get the latest version of the PowerShellGet module to install this module, '{2}'.
PathNotFound=Cannot find the path '{0}' because it does not exist.
ModuleIsNotTrusted=You are installing the module '{0}' from an untrusted repository. If you trust this repository, change its InstallationPolicy value by running the Set-PSRepository cmdlet.
UnableResolveModuleDependency=PowerShellGet cannot resolve the module dependency '{0}' of the repository '{1}' on the module '{2}'. Verify that the dependent module '{3}' is available in the repository '{4}'. Avoid specifying built-in Windows PowerShell modules in the RequiredModules list of the module manifest.
FindingModuleDependencies=Finding module dependencies for version '{1}' of the module '{0}' from repository '{2}'.
InstallingDependencyModule=Installing the dependency module '{0}' with version '{1}' for the module '{2}'.
SavingDependencyModule=Saving the dependency module '{0}' with version '{1}' for the module '{2}'.
ModuleUninstallationSucceeded=Successfully uninstalled the module '{0}' from module base '{1}'.
AdminPrivilegesRequiredForUninstall=You cannot uninstall the module '{0}' from '{1}' because Administrator rights are required to uninstall from that folder. Log on to the computer with an account that has Administrator rights, and then try again. You can also try running the Windows PowerShell session with elevated rights (Run as Administrator).
ModuleUninstallationNotPossibleAsItIsNotInstalledUsingPowerShellGet=Module '{0}' was not installed on this computer by using either the PowerShellGet cmdlets or the PSModule provider, so it cannot be uninstalled.
UnableToUninstallModuleVersion=The module '{0}' of version '{1}' in module base folder '{2}' was installed without side-by-side version support. Some versions are installed in this module base with side-by-side version support. Uninstall other versions of this module before uninstalling the most current version.
UnableToUninstallAsOtherModulesNeedThisModule=The module '{0}' of version '{1}' in module base folder '{2}' cannot be uninstalled, because one or more other modules '{3}'  are dependent on this module. Uninstall the modules that depend on this module before uninstalling module '{4}'.
RepositoryIsNotTrusted=You are installing the module(s) from an untrusted repository. If you trust this repository, change its InstallationPolicy value by running the Set-PSRepository cmdlet.
QueryInstallUntrustedPackage=Are you sure you want to install software from '{0}'?
SourceNotFound=Unable to find module repository '{0}'. Use Get-PSRepository to see all available module repositories.
PSGalleryApiV2Deprecated=PowerShell Gallery v2 has been deprecated.  Please run 'Update-Module -Name PowerShellGet' to update to PowerShell Gallery v3.  For more information, please visit our website at 'https://www.powershellgallery.com'.
PSGalleryApiV2Discontinued=PowerShell Gallery v2 has been discontinued.  Please run 'Update-Module -Name PowerShellGet' to update to PowerShell Gallery v3.  For more information, please visit our website at 'https://www.powershellgallery.com'.
PowerShellGalleryUnavailable=PowerShell Gallery is currently unavailable.  Please try again later.
PowerShellGetModuleIsNotInstalledProperly=The PowerShellGet module was not installed properly. Be sure that only one instance or version of the PowerShellGet module is installed in the path '{0}'.
PowerShelLGetModuleGotUpdated=The PowerShellGet module was updated successfully. Restart the process to use the updated version of the PowerShellGet module.
###PSLOC
'@

# SIG # Begin signature block
# MIIavwYJKoZIhvcNAQcCoIIasDCCGqwCAQExCzAJBgUrDgMCGgUAMGkGCisGAQQB
# gjcCAQSgWzBZMDQGCisGAQQBgjcCAR4wJgIDAQAABBAfzDtgWUsITrck0sYpfvNR
# AgEAAgEAAgEAAgEAAgEAMCEwCQYFKw4DAhoFAAQUF163tfcz8uVc/ePaJH7O/yes
# nWygghWCMIIEwzCCA6ugAwIBAgITMwAAAHPGWcJSl4OjOgAAAAAAczANBgkqhkiG
# 9w0BAQUFADB3MQswCQYDVQQGEwJVUzETMBEGA1UECBMKV2FzaGluZ3RvbjEQMA4G
# A1UEBxMHUmVkbW9uZDEeMBwGA1UEChMVTWljcm9zb2Z0IENvcnBvcmF0aW9uMSEw
# HwYDVQQDExhNaWNyb3NvZnQgVGltZS1TdGFtcCBQQ0EwHhcNMTUwMzIwMTczMjA0
# WhcNMTYwNjIwMTczMjA0WjCBszELMAkGA1UEBhMCVVMxEzARBgNVBAgTCldhc2hp
# bmd0b24xEDAOBgNVBAcTB1JlZG1vbmQxHjAcBgNVBAoTFU1pY3Jvc29mdCBDb3Jw
# b3JhdGlvbjENMAsGA1UECxMETU9QUjEnMCUGA1UECxMebkNpcGhlciBEU0UgRVNO
# OkJCRUMtMzBDQS0yREJFMSUwIwYDVQQDExxNaWNyb3NvZnQgVGltZS1TdGFtcCBT
# ZXJ2aWNlMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAp0QvcscV762c
# vJQkN4+yFC55LDaPb7KevwD6jHhhG5S5Uij0cT8HGE/y6Je/f3Ow4zVsoSviUbYn
# qqI1ASnzKaVQ3natkrIUuQ8Mllkya3MeSL9Q877ogSskJFB0fOph5o8RAe6yfSD1
# CkMqVGVAxRwMNFDik+TCDS7gUJlQaAZ9h3v2jQWOR+Xt0ELjY93j7iXPqVCjT4K7
# x5WFfasB4FBCFeBZg8lR4D2gKOh/gnzSuRoCHqhzdFfIf7gJs7pF4EfCdNSp2BLX
# Lxuc1K567c/CWXMh3LDjZMMd5i8EvFv9ssV+Nua6VnlcHRWrsaB9FygH8+OpkVg8
# tkWf1jVh3QIDAQABo4IBCTCCAQUwHQYDVR0OBBYEFDUsc4HZ7HD5Sj2P/0fAfApo
# obgbMB8GA1UdIwQYMBaAFCM0+NlSRnAK7UD7dvuzK7DDNbMPMFQGA1UdHwRNMEsw
# SaBHoEWGQ2h0dHA6Ly9jcmwubWljcm9zb2Z0LmNvbS9wa2kvY3JsL3Byb2R1Y3Rz
# L01pY3Jvc29mdFRpbWVTdGFtcFBDQS5jcmwwWAYIKwYBBQUHAQEETDBKMEgGCCsG
# AQUFBzAChjxodHRwOi8vd3d3Lm1pY3Jvc29mdC5jb20vcGtpL2NlcnRzL01pY3Jv
# c29mdFRpbWVTdGFtcFBDQS5jcnQwEwYDVR0lBAwwCgYIKwYBBQUHAwgwDQYJKoZI
# hvcNAQEFBQADggEBABhW2Lwu5/R0+yuB1kWyYWp9G8CaWAHqZhnXuCn1jzz09iI2
# d1FUmQud9f7Fg9U7F18kV7sSywfz8omzn+eIMTZc0N0QbbGdHG5zeUCA26QRbUwQ
# 6BCVoUNlxEgptx5suXvzd7dgvF0jpzSnWPUVzaasjBvdqMfy/L2f24Jaiu9s8vsu
# w79c0Y2DVhPd4x2T7ReueUVSCxzhK8AzUN271fiW2JRLQ0tRCF8tnA5TKJe7RuvG
# emKndxIklRnPRf1Y2R0getwBvO8Lg3pDeZDUR+AIteZ96oBsSHnsJwxb8T45Ur6a
# lIw5sEMholc7XInenHZH5DEg0aJpQ86Btpv5rzgwggTsMIID1KADAgECAhMzAAAA
# ymzVMhI1xOFVAAEAAADKMA0GCSqGSIb3DQEBBQUAMHkxCzAJBgNVBAYTAlVTMRMw
# EQYDVQQIEwpXYXNoaW5ndG9uMRAwDgYDVQQHEwdSZWRtb25kMR4wHAYDVQQKExVN
# aWNyb3NvZnQgQ29ycG9yYXRpb24xIzAhBgNVBAMTGk1pY3Jvc29mdCBDb2RlIFNp
# Z25pbmcgUENBMB4XDTE0MDQyMjE3MzkwMFoXDTE1MDcyMjE3MzkwMFowgYMxCzAJ
# BgNVBAYTAlVTMRMwEQYDVQQIEwpXYXNoaW5ndG9uMRAwDgYDVQQHEwdSZWRtb25k
# MR4wHAYDVQQKExVNaWNyb3NvZnQgQ29ycG9yYXRpb24xDTALBgNVBAsTBE1PUFIx
# HjAcBgNVBAMTFU1pY3Jvc29mdCBDb3Jwb3JhdGlvbjCCASIwDQYJKoZIhvcNAQEB
# BQADggEPADCCAQoCggEBAJZxXe0GRvqEy51bt0bHsOG0ETkDrbEVc2Cc66e2bho8
# P/9l4zTxpqUhXlaZbFjkkqEKXMLT3FIvDGWaIGFAUzGcbI8hfbr5/hNQUmCVOlu5
# WKV0YUGplOCtJk5MoZdwSSdefGfKTx5xhEa8HUu24g/FxifJB+Z6CqUXABlMcEU4
# LYG0UKrFZ9H6ebzFzKFym/QlNJj4VN8SOTgSL6RrpZp+x2LR3M/tPTT4ud81MLrs
# eTKp4amsVU1Mf0xWwxMLdvEH+cxHrPuI1VKlHij6PS3Pz4SYhnFlEc+FyQlEhuFv
# 57H8rEBEpamLIz+CSZ3VlllQE1kYc/9DDK0r1H8wQGcCAwEAAaOCAWAwggFcMBMG
# A1UdJQQMMAoGCCsGAQUFBwMDMB0GA1UdDgQWBBQfXuJdUI1Whr5KPM8E6KeHtcu/
# gzBRBgNVHREESjBIpEYwRDENMAsGA1UECxMETU9QUjEzMDEGA1UEBRMqMzE1OTUr
# YjQyMThmMTMtNmZjYS00OTBmLTljNDctM2ZjNTU3ZGZjNDQwMB8GA1UdIwQYMBaA
# FMsR6MrStBZYAck3LjMWFrlMmgofMFYGA1UdHwRPME0wS6BJoEeGRWh0dHA6Ly9j
# cmwubWljcm9zb2Z0LmNvbS9wa2kvY3JsL3Byb2R1Y3RzL01pY0NvZFNpZ1BDQV8w
# OC0zMS0yMDEwLmNybDBaBggrBgEFBQcBAQROMEwwSgYIKwYBBQUHMAKGPmh0dHA6
# Ly93d3cubWljcm9zb2Z0LmNvbS9wa2kvY2VydHMvTWljQ29kU2lnUENBXzA4LTMx
# LTIwMTAuY3J0MA0GCSqGSIb3DQEBBQUAA4IBAQB3XOvXkT3NvXuD2YWpsEOdc3wX
# yQ/tNtvHtSwbXvtUBTqDcUCBCaK3cSZe1n22bDvJql9dAxgqHSd+B+nFZR+1zw23
# VMcoOFqI53vBGbZWMrrizMuT269uD11E9dSw7xvVTsGvDu8gm/Lh/idd6MX/YfYZ
# 0igKIp3fzXCCnhhy2CPMeixD7v/qwODmHaqelzMAUm8HuNOIbN6kBjWnwlOGZRF3
# CY81WbnYhqgA/vgxfSz0jAWdwMHVd3Js6U1ZJoPxwrKIV5M1AHxQK7xZ/P4cKTiC
# 095Sl0UpGE6WW526Xxuj8SdQ6geV6G00DThX3DcoNZU6OJzU7WqFXQ4iEV57MIIF
# vDCCA6SgAwIBAgIKYTMmGgAAAAAAMTANBgkqhkiG9w0BAQUFADBfMRMwEQYKCZIm
# iZPyLGQBGRYDY29tMRkwFwYKCZImiZPyLGQBGRYJbWljcm9zb2Z0MS0wKwYDVQQD
# EyRNaWNyb3NvZnQgUm9vdCBDZXJ0aWZpY2F0ZSBBdXRob3JpdHkwHhcNMTAwODMx
# MjIxOTMyWhcNMjAwODMxMjIyOTMyWjB5MQswCQYDVQQGEwJVUzETMBEGA1UECBMK
# V2FzaGluZ3RvbjEQMA4GA1UEBxMHUmVkbW9uZDEeMBwGA1UEChMVTWljcm9zb2Z0
# IENvcnBvcmF0aW9uMSMwIQYDVQQDExpNaWNyb3NvZnQgQ29kZSBTaWduaW5nIFBD
# QTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBALJyWVwZMGS/HZpgICBC
# mXZTbD4b1m/My/Hqa/6XFhDg3zp0gxq3L6Ay7P/ewkJOI9VyANs1VwqJyq4gSfTw
# aKxNS42lvXlLcZtHB9r9Jd+ddYjPqnNEf9eB2/O98jakyVxF3K+tPeAoaJcap6Vy
# c1bxF5Tk/TWUcqDWdl8ed0WDhTgW0HNbBbpnUo2lsmkv2hkL/pJ0KeJ2L1TdFDBZ
# +NKNYv3LyV9GMVC5JxPkQDDPcikQKCLHN049oDI9kM2hOAaFXE5WgigqBTK3S9dP
# Y+fSLWLxRT3nrAgA9kahntFbjCZT6HqqSvJGzzc8OJ60d1ylF56NyxGPVjzBrAlf
# A9MCAwEAAaOCAV4wggFaMA8GA1UdEwEB/wQFMAMBAf8wHQYDVR0OBBYEFMsR6MrS
# tBZYAck3LjMWFrlMmgofMAsGA1UdDwQEAwIBhjASBgkrBgEEAYI3FQEEBQIDAQAB
# MCMGCSsGAQQBgjcVAgQWBBT90TFO0yaKleGYYDuoMW+mPLzYLTAZBgkrBgEEAYI3
# FAIEDB4KAFMAdQBiAEMAQTAfBgNVHSMEGDAWgBQOrIJgQFYnl+UlE/wq4QpTlVnk
# pDBQBgNVHR8ESTBHMEWgQ6BBhj9odHRwOi8vY3JsLm1pY3Jvc29mdC5jb20vcGtp
# L2NybC9wcm9kdWN0cy9taWNyb3NvZnRyb290Y2VydC5jcmwwVAYIKwYBBQUHAQEE
# SDBGMEQGCCsGAQUFBzAChjhodHRwOi8vd3d3Lm1pY3Jvc29mdC5jb20vcGtpL2Nl
# cnRzL01pY3Jvc29mdFJvb3RDZXJ0LmNydDANBgkqhkiG9w0BAQUFAAOCAgEAWTk+
# fyZGr+tvQLEytWrrDi9uqEn361917Uw7LddDrQv+y+ktMaMjzHxQmIAhXaw9L0y6
# oqhWnONwu7i0+Hm1SXL3PupBf8rhDBdpy6WcIC36C1DEVs0t40rSvHDnqA2iA6VW
# 4LiKS1fylUKc8fPv7uOGHzQ8uFaa8FMjhSqkghyT4pQHHfLiTviMocroE6WRTsgb
# 0o9ylSpxbZsa+BzwU9ZnzCL/XB3Nooy9J7J5Y1ZEolHN+emjWFbdmwJFRC9f9Nqu
# 1IIybvyklRPk62nnqaIsvsgrEA5ljpnb9aL6EiYJZTiU8XofSrvR4Vbo0HiWGFzJ
# NRZf3ZMdSY4tvq00RBzuEBUaAF3dNVshzpjHCe6FDoxPbQ4TTj18KUicctHzbMrB
# 7HCjV5JXfZSNoBtIA1r3z6NnCnSlNu0tLxfI5nI3EvRvsTxngvlSso0zFmUeDord
# EN5k9G/ORtTTF+l5xAS00/ss3x+KnqwK+xMnQK3k+eGpf0a7B2BHZWBATrBC7E7t
# s3Z52Ao0CW0cgDEf4g5U3eWh++VHEK1kmP9QFi58vwUheuKVQSdpw5OPlcmN2Jsh
# rg1cnPCiroZogwxqLbt2awAdlq3yFnv2FoMkuYjPaqhHMS+a3ONxPdcAfmJH0c6I
# ybgY+g5yjcGjPa8CQGr/aZuW4hCoELQ3UAjWwz0wggYHMIID76ADAgECAgphFmg0
# AAAAAAAcMA0GCSqGSIb3DQEBBQUAMF8xEzARBgoJkiaJk/IsZAEZFgNjb20xGTAX
# BgoJkiaJk/IsZAEZFgltaWNyb3NvZnQxLTArBgNVBAMTJE1pY3Jvc29mdCBSb290
# IENlcnRpZmljYXRlIEF1dGhvcml0eTAeFw0wNzA0MDMxMjUzMDlaFw0yMTA0MDMx
# MzAzMDlaMHcxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpXYXNoaW5ndG9uMRAwDgYD
# VQQHEwdSZWRtb25kMR4wHAYDVQQKExVNaWNyb3NvZnQgQ29ycG9yYXRpb24xITAf
# BgNVBAMTGE1pY3Jvc29mdCBUaW1lLVN0YW1wIFBDQTCCASIwDQYJKoZIhvcNAQEB
# BQADggEPADCCAQoCggEBAJ+hbLHf20iSKnxrLhnhveLjxZlRI1Ctzt0YTiQP7tGn
# 0UytdDAgEesH1VSVFUmUG0KSrphcMCbaAGvoe73siQcP9w4EmPCJzB/LMySHnfL0
# Zxws/HvniB3q506jocEjU8qN+kXPCdBer9CwQgSi+aZsk2fXKNxGU7CG0OUoRi4n
# rIZPVVIM5AMs+2qQkDBuh/NZMJ36ftaXs+ghl3740hPzCLdTbVK0RZCfSABKR2YR
# JylmqJfk0waBSqL5hKcRRxQJgp+E7VV4/gGaHVAIhQAQMEbtt94jRrvELVSfrx54
# QTF3zJvfO4OToWECtR0Nsfz3m7IBziJLVP/5BcPCIAsCAwEAAaOCAaswggGnMA8G
# A1UdEwEB/wQFMAMBAf8wHQYDVR0OBBYEFCM0+NlSRnAK7UD7dvuzK7DDNbMPMAsG
# A1UdDwQEAwIBhjAQBgkrBgEEAYI3FQEEAwIBADCBmAYDVR0jBIGQMIGNgBQOrIJg
# QFYnl+UlE/wq4QpTlVnkpKFjpGEwXzETMBEGCgmSJomT8ixkARkWA2NvbTEZMBcG
# CgmSJomT8ixkARkWCW1pY3Jvc29mdDEtMCsGA1UEAxMkTWljcm9zb2Z0IFJvb3Qg
# Q2VydGlmaWNhdGUgQXV0aG9yaXR5ghB5rRahSqClrUxzWPQHEy5lMFAGA1UdHwRJ
# MEcwRaBDoEGGP2h0dHA6Ly9jcmwubWljcm9zb2Z0LmNvbS9wa2kvY3JsL3Byb2R1
# Y3RzL21pY3Jvc29mdHJvb3RjZXJ0LmNybDBUBggrBgEFBQcBAQRIMEYwRAYIKwYB
# BQUHMAKGOGh0dHA6Ly93d3cubWljcm9zb2Z0LmNvbS9wa2kvY2VydHMvTWljcm9z
# b2Z0Um9vdENlcnQuY3J0MBMGA1UdJQQMMAoGCCsGAQUFBwMIMA0GCSqGSIb3DQEB
# BQUAA4ICAQAQl4rDXANENt3ptK132855UU0BsS50cVttDBOrzr57j7gu1BKijG1i
# uFcCy04gE1CZ3XpA4le7r1iaHOEdAYasu3jyi9DsOwHu4r6PCgXIjUji8FMV3U+r
# kuTnjWrVgMHmlPIGL4UD6ZEqJCJw+/b85HiZLg33B+JwvBhOnY5rCnKVuKE5nGct
# xVEO6mJcPxaYiyA/4gcaMvnMMUp2MT0rcgvI6nA9/4UKE9/CCmGO8Ne4F+tOi3/F
# NSteo7/rvH0LQnvUU3Ih7jDKu3hlXFsBFwoUDtLaFJj1PLlmWLMtL+f5hYbMUVbo
# nXCUbKw5TNT2eb+qGHpiKe+imyk0BncaYsk9Hm0fgvALxyy7z0Oz5fnsfbXjpKh0
# NbhOxXEjEiZ2CzxSjHFaRkMUvLOzsE1nyJ9C/4B5IYCeFTBm6EISXhrIniIh0EPp
# K+m79EjMLNTYMoBMJipIJF9a6lbvpt6Znco6b72BJ3QGEe52Ib+bgsEnVLaxaj2J
# oXZhtG6hE6a/qkfwEm/9ijJssv7fUciMI8lmvZ0dhxJkAj0tr1mPuOQh5bWwymO0
# eFQF1EEuUKyUsKV4q7OglnUa2ZKHE3UiLzKoCG6gW4wlv6DvhMoh1useT8ma7kng
# 9wFlb4kLfchpyOZu6qeXzjEp/w7FW1zYTRuh2Povnj8uVRZryROj/TGCBKcwggSj
# AgEBMIGQMHkxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpXYXNoaW5ndG9uMRAwDgYD
# VQQHEwdSZWRtb25kMR4wHAYDVQQKExVNaWNyb3NvZnQgQ29ycG9yYXRpb24xIzAh
# BgNVBAMTGk1pY3Jvc29mdCBDb2RlIFNpZ25pbmcgUENBAhMzAAAAymzVMhI1xOFV
# AAEAAADKMAkGBSsOAwIaBQCggcAwGQYJKoZIhvcNAQkDMQwGCisGAQQBgjcCAQQw
# HAYKKwYBBAGCNwIBCzEOMAwGCisGAQQBgjcCARUwIwYJKoZIhvcNAQkEMRYEFDlm
# KcEHVZkDxT9Itz66HZO9qIGIMGAGCisGAQQBgjcCAQwxUjBQoCaAJABXAGkAbgBk
# AG8AdwBzACAAUABvAHcAZQByAFMAaABlAGwAbKEmgCRodHRwOi8vd3d3Lm1pY3Jv
# c29mdC5jb20vcG93ZXJzaGVsbCAwDQYJKoZIhvcNAQEBBQAEggEAYpadqnljKxjH
# 523+y57mVaGMpDMYJcR2u9nR8oPL2fj8fbxYcNmKeYKL8/Z+aMsRLeWynRte4OOU
# TJtfZ2PPYMWlFUqDF9crVnkm99c1Ga2t0r1JHx4MXo/xBS/zv3Xcj1xReBmrFMgk
# aQazLl/Bd1DlGBtKcb0N8k0fQKt7ItO6R1c5iKyqz6sEtQWvhnbW9/VTgfg74N3Q
# Coj2a41EwMNRDs2IXZjXEezPGsMT2YCDZ+uRCL44JrLAj5PamMgJOjwppYl5Paba
# yFW619aN0/bbXr85if25rBoUat8pjDLKo4QCwfvPD2B4Yk2W6k++oAGd6ycTKbfb
# AWkeKF1WyaGCAigwggIkBgkqhkiG9w0BCQYxggIVMIICEQIBATCBjjB3MQswCQYD
# VQQGEwJVUzETMBEGA1UECBMKV2FzaGluZ3RvbjEQMA4GA1UEBxMHUmVkbW9uZDEe
# MBwGA1UEChMVTWljcm9zb2Z0IENvcnBvcmF0aW9uMSEwHwYDVQQDExhNaWNyb3Nv
# ZnQgVGltZS1TdGFtcCBQQ0ECEzMAAABzxlnCUpeDozoAAAAAAHMwCQYFKw4DAhoF
# AKBdMBgGCSqGSIb3DQEJAzELBgkqhkiG9w0BBwEwHAYJKoZIhvcNAQkFMQ8XDTE1
# MDQwODIyNTIyM1owIwYJKoZIhvcNAQkEMRYEFDHetZ3Hgczc3OQ1KsTCq3UA0xwB
# MA0GCSqGSIb3DQEBBQUABIIBAHHjHOmiwiS8CrPPFsFPXxx5zl3mb/lEMNdVtCfX
# djcbpqrevP5Q7khmcZxjvpOJnVVRmUtAteO9sfKJTMZ287wwjzZoyZtfdFaCZjGd
# mcZSi5WS5MEGjnIukUm+6/E8K9Zf9sE0if3KKzMQ/y30gsKTp7/jCFG6nbyNCjmV
# bjTl1cMZeVUpIcNdGhhmKTOeTBO3gQorE1vniweT8A0QpAgDJ9kWc6AIBlNNYpBm
# FNJ5RSGoclBdXkDemcPdIOBZi+t/RpI79mc57dLIM56tuTh5lMBbH+rszg1Z42P2
# YVntNvJrILWji2kfI4E5SjlhPS9xHFtUw58omNq9eaMf1YY=
# SIG # End signature block
