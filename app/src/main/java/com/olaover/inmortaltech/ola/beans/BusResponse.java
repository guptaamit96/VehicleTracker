package com.olaover.inmortaltech.ola.beans;

import java.util.List;

public class BusResponse {

    /**
     * geocoded_waypoints : [{"geocoder_status":"OK","place_id":"ChIJ3w_FQbvxDDkRuph3atJv8OY","types":["locality","political"]},{"geocoder_status":"OK","place_id":"ChIJLbZ-NFv9DDkRQJY4FbcFcgM","types":["administrative_area_level_1","locality","political"]}]
     * routes : [{"bounds":{"northeast":{"lat":28.73764,"lng":77.431783},"southwest":{"lat":28.66595999999999,"lng":77.10089900000001}},"copyrights":"Map data ©2018 Google","legs":[{"arrival_time":{"text":"8:48pm","time_zone":"Asia/Calcutta","value":1531322306},"departure_time":{"text":"6:13pm","time_zone":"Asia/Calcutta","value":1531313011},"distance":{"text":"41.2 km","value":41187},"duration":{"text":"2 hours 35 mins","value":9295},"end_address":"Delhi, India","end_location":{"lat":28.704112,"lng":77.1024411},"start_address":"Ghaziabad, Uttar Pradesh, India","start_location":{"lat":28.671886,"lng":77.411377},"steps":[{"distance":{"text":"2.5 km","value":2549},"duration":{"text":"7 mins","value":411},"end_location":{"lat":28.670478,"lng":77.431164},"html_instructions":"Bus towards Ghaziabad Purana Bus Adda","polyline":{"points":"i~~mDclnwMH@Di@N}A?]E][w@_AgB_BiCcAaBC[?SDc@H[L[VYTO|ADvAM\\Ep@W`DoB`@o@x@gClAsDp@_BnEcHbBsCj@oAj@cAv@kAl@q@~@m@dB}@_@o@gAkA{DkDmF{EoBeBQ]]gAUoBg@iGoBoSC@"},"start_location":{"lat":28.671886,"lng":77.411377},"transit_details":{"arrival_stop":{"location":{"lat":28.670478,"lng":77.431164},"name":"Ghaziabad Purana Bus Adda"},"arrival_time":{"text":"6:20pm","time_zone":"Asia/Calcutta","value":1531313422},"departure_stop":{"location":{"lat":28.671886,"lng":77.411377},"name":"Meerut More"},"departure_time":{"text":"6:13pm","time_zone":"Asia/Calcutta","value":1531313011},"headsign":"Ghaziabad Purana Bus Adda","line":{"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"name":"Bhajan Pura - Ghaziabad Purana Bus Adda","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":1},"travel_mode":"TRANSIT"},{"distance":{"text":"0.1 km","value":138},"duration":{"text":"2 mins","value":112},"end_location":{"lat":28.6702133,"lng":77.4312252},"html_instructions":"Walk to Ghaziabad Purana Bus Adda","polyline":{"points":"iu~mDygrwMQqBn@GPlB"},"start_location":{"lat":28.6704515,"lng":77.4311692},"steps":[{"distance":{"text":"56 m","value":56},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.6705376,"lng":77.4317363},"html_instructions":"Head <b>east<\/b> toward <b>Ambedkar Rd<\/b>/<b>Dr Shyam Prasad Mukh Marg<\/b>","polyline":{"points":"iu~mDygrwMQqB"},"start_location":{"lat":28.6704515,"lng":77.4311692},"travel_mode":"WALKING"},{"distance":{"text":"27 m","value":27},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.6702957,"lng":77.431783},"html_instructions":"Turn <b>right<\/b> at <b>Old Bus Stand Chowk<\/b> onto <b>Ambedkar Rd<\/b>/<b>Dr Shyam Prasad Mukh Marg<\/b>","maneuver":"turn-right","polyline":{"points":"{u~mDkkrwMn@G"},"start_location":{"lat":28.6705376,"lng":77.4317363},"travel_mode":"WALKING"},{"distance":{"text":"55 m","value":55},"duration":{"text":"1 min","value":45},"end_location":{"lat":28.6702133,"lng":77.4312252},"html_instructions":"Turn <b>right<\/b> at <b>Old Bus Stand Chowk<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-right","polyline":{"points":"kt~mDskrwMPlB"},"start_location":{"lat":28.6702957,"lng":77.431783},"travel_mode":"WALKING"}],"travel_mode":"WALKING"},{"distance":{"text":"17.1 km","value":17087},"duration":{"text":"58 mins","value":3474},"end_location":{"lat":28.702937,"lng":77.269965},"html_instructions":"Bus towards Bhajan Pura","polyline":{"points":"ct~mDchrwMI@rA~Op@dJLxAN|@b@bAlGvFjEzDfCbC\\`@T^FN}Az@}@n@w@t@i@v@cAbBWd@UXKFe@v@eE~GsAvCeAlC}BfHg@jBcEdTe@tCuBxMcA~FcBnJa@vAuAzGcCbMa@`DIrAu@rFs@hFy@bFy@|Dg@jCu@dFw@~Dk@|CqCdPmCvOQ|BItBKhLE`GGh@_@v@wF|HmAjAuE~Dm@h@{@t@oA`AkAt@A@iBbAkD`Bw@ZqG~CgGpC_Bj@OH[N_@RKFABADCDCBKhCSjF]`M}@~Yy@xY?N?@GxCAhFTpCD^B@DDBDBNCRKHEBM^C\\UvGy@`La@nCy@~D[jAg@rAqEfL_BdE_CbGUh@_AhC]jBq@hEEP}@tFyAzIe@rCw@`E_B|Iu@vEeBfKSjBiAdJOhBU|AcAzG_AhGQn@WdBa@xBYpBc@dCa@nCw@lEcAfG_@`CApA?j@BlAB\\LzBt@hGVzAXvAj@rB`@xBNjAT|CLrDE~BWlCEh@}@fJIr@c@zEAFoBjQW`E]|EEd@o@nKe@zJMrBW`E[rDYlCa@bEg@fFc@~DQ~BS|CaAzOi@nJ[nFGjBQhCSrEg@lNObCOdDw@xQOtEaAxTCb@c@zKMzDOvGAxAE?"},"start_location":{"lat":28.670256,"lng":77.43121699999999},"transit_details":{"arrival_stop":{"location":{"lat":28.702937,"lng":77.269965},"name":"B Block Yamuna Vihar"},"arrival_time":{"text":"7:27pm","time_zone":"Asia/Calcutta","value":1531317474},"departure_stop":{"location":{"lat":28.670256,"lng":77.43121699999999},"name":"Ghaziabad Purana Bus Adda"},"departure_time":{"text":"6:30pm","time_zone":"Asia/Calcutta","value":1531314000},"headsign":"Bhajan Pura","line":{"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"name":"Bhajan Pura - Ghaziabad Purana Bus Adda","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":16},"travel_mode":"TRANSIT"},{"distance":{"text":"21.2 km","value":21186},"duration":{"text":"1 hour 12 mins","value":4345},"end_location":{"lat":28.703981,"lng":77.100926},"html_instructions":"Bus towards Q Block Mangolpuri Terminal","polyline":{"points":"k`enDgxrvMD?CfCa@~Hg@nOW|HOdDI|ASzIFX@h@?t@GpBGd@eAxFcA`GI`@Pf@DX@VCXGTMTKNWjCALYlFg@|KK|E@dC?lA@f@?h@?p@?|@Cf@GNa@Zi@b@w@`@_@La@BgAEa@Bm@Lg@XYTW\\Qb@qFzX}AvHm@|C_CrLiBpI]bAKPiAbGiEvTW~C?VH`@bAjAJR\\lAXvAB`@B`@FnANnAl@|BZhAWH}Bh@{ANk@@yBMiD]SIOGOEsABs@Dm@HmDn@kEjAyDpAm@`@}@bA}@|AgAxB{AdDYl@GLy@fBSb@]dAmCfKeCbKaAnDg@hBoFbSaH~W}D|NqA~Ee@dB_CpIqAlEa@rAIjAi@rC}@bGq@~E?j@@J?\\CLIPMLMh@I^{B|Mk@lBkBlMwCfSE|@g@jEoBpMoBjKa@hCu@hEoAfGu@fDy@hCWZ]rA_BlGUz@}GfWW|@u@nCAl@e@jCc@tAkAfFoArHSpB]lEOvD?lFAtEIt@Dp@XvBZpA|AzE`BpFbB`FtAfDpAbCnAdC`C~EfGzJpA|B^p@zAlCvDnGZT`CpDpBjDrCpFh@|@n@hAlAhBrBzC|AlBd@h@fAnAr@r@pAfAvAz@~A~@dDbBp@XlBh@pEjA|Bb@b@HlGx@dC^jGv@@Ir@J~Dd@nBX`ANrEt@vC~@tCr@zBv@jAn@zE~Cn@f@JLN^~CdCjFjEr@n@xBhBx@p@tBfB~FjEvB`BVTfBzA`Az@VVGJEHABQVkEpHs@lA}@jAu@nAu@jA{BzDg@x@}AdCmClEsClEc@t@{AbCgCbE}BpDeBvCaA|AyC~EmB|CyBhDKPyBlDeFnIgAfBgCdEe@t@SZO^?JfJ~HlGlFp@j@~CjC|BfBpAjA|ArAvHxGhA~@dCvBzMlL`ClB`DtClC`CBE"},"start_location":{"lat":28.702937,"lng":77.269965},"transit_details":{"arrival_stop":{"location":{"lat":28.703981,"lng":77.100926},"name":"Rohini Sector 1 Avantika"},"arrival_time":{"text":"8:45pm","time_zone":"Asia/Calcutta","value":1531322136},"departure_stop":{"location":{"lat":28.702937,"lng":77.269965},"name":"B Block Yamuna Vihar"},"departure_time":{"text":"7:33pm","time_zone":"Asia/Calcutta","value":1531317791},"headsign":"Q Block Mangolpuri Terminal","line":{"agencies":[{"name":"DIMTS","phone":"011 91 11 4309 0100","url":"http://businfo.dimts.in/businfo/"}],"short_name":"932A","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":34},"travel_mode":"TRANSIT"},{"distance":{"text":"0.2 km","value":227},"duration":{"text":"3 mins","value":169},"end_location":{"lat":28.704112,"lng":77.1024411},"html_instructions":"Walk to Delhi, India","polyline":{"points":"_genDswquMYYVa@RYb@s@FK\\k@BEq@i@A@EBABA?A?A?ECECEE?AA??A?A?A@CDIg@g@"},"start_location":{"lat":28.7039956,"lng":77.1009043},"steps":[{"distance":{"text":"19 m","value":19},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.7041343,"lng":77.1010252},"html_instructions":"Head <b>northeast<\/b> on <b>Sir Chotu Ram Marg<\/b>","polyline":{"points":"_genDswquMYY"},"start_location":{"lat":28.7039956,"lng":77.1009043},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":109},"duration":{"text":"1 min","value":85},"end_location":{"lat":28.7035249,"lng":77.1019008},"html_instructions":"Turn <b>right<\/b> at Shree Sudarshan Electronics","maneuver":"turn-right","polyline":{"points":"ygenDmxquMVa@RYb@s@FK\\k@BE"},"start_location":{"lat":28.7041343,"lng":77.1010252},"travel_mode":"WALKING"},{"distance":{"text":"34 m","value":34},"duration":{"text":"1 min","value":24},"end_location":{"lat":28.7037663,"lng":77.1021109},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"_denD{}quMq@i@"},"start_location":{"lat":28.7035249,"lng":77.1019008},"travel_mode":"WALKING"},{"distance":{"text":"35 m","value":35},"duration":{"text":"1 min","value":25},"end_location":{"lat":28.70391189999999,"lng":77.1022401},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"qeenDe_ruMA@EBABA?A?A?ECECEE?AA??A?A?A@CDI"},"start_location":{"lat":28.7037663,"lng":77.1021109},"travel_mode":"WALKING"},{"distance":{"text":"30 m","value":30},"duration":{"text":"1 min","value":21},"end_location":{"lat":28.704112,"lng":77.1024411},"html_instructions":"Turn <b>left<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-left","polyline":{"points":"mfenD_`ruMg@g@"},"start_location":{"lat":28.70391189999999,"lng":77.1022401},"travel_mode":"WALKING"}],"travel_mode":"WALKING"}],"traffic_speed_entry":[],"via_waypoint":[]}],"overview_polyline":{"points":"i~~mDclnwMH@Di@N{BE][w@_DqFcAaBC[Dw@Vw@l@i@|ADvAM\\Ep@W`DoB`@o@fC{Hp@_BnEcHbBsCj@oAbBoCl@q@~@m@dB}@_@o@gAkA{DkD}IaIo@eB}@yJsBmSDAQqBn@GPlBSBdCd[\\vCb@bAlGvFrI~Hr@`AFN}Az@}@n@w@t@mBzCm@~@KFe@v@eE~GsAvCeAlC}BfHg@jBcEdTe@tCyDxUcBnJa@vAyE~Ua@`DIrAiB|My@bFy@|Dg@jCu@dFcB|I_H|`@[rFQjTGh@_@v@wF|HmAjAcGhF{@t@}CxBuGdDiIzDgGpC_Bj@k@Xk@ZCHGH_@tJuCjcAGzCAhFTpCH`@HJ?b@QLM^C\\UvGy@`La@nCy@~DcA~CgMz[_AhC]jBw@zEwCpQ}AtIuCtPeBfKSjBiAdJOhByAxJ_AhGQn@y@~EwCtQcBhKA|BFjBLzBt@hGp@rDj@rB`@xBd@hFLrDE~B]vDgAzKe@bFoBjQW`Ec@bGuAjWe@tHu@`IiAjLu@~H{Cxg@GjBe@|Ig@lNObCgA~VyBni@]rMAxAE?D?CfCa@~Hg@nOW|HYbGSzIFX@~AOvCiCzNI`@Pf@Fp@Kn@Yd@YxCaAjSK|E@dC@tBC`EGNa@Zi@b@w@`@_@La@BgAEa@Bm@Lg@Xq@r@Qb@qFzXkCtMiFdWi@tAsGz\\WvDH`@bAjAh@`B\\xBJpBNnAl@|BZhAWH}Bh@{ANk@@yBMiD]SI_@MgCH{Ex@kEjAyDpAm@`@}@bAeCvEuBrEaAtBq@hBsGjWiBxGqObl@oG|UeDvLsB`HIjAi@rCoBbN@v@Cj@W^WhA{B|Mk@lBcGta@E|@g@jEoBpMoBjKwArIeCnLy@hCWZ}B`JaKp_@Al@e@jCc@tAkAfFoArHSpB]lEOvD?lFAtEIt@^hDZpA|AzEdErMtAfDpAbCpEdJxIxNzB~DvDnGZT`CpDpBjD|DnH|BrDrBzC|AlBlBxBdCzBvDzBvE|B~HtB`Dl@rKxAjGv@@IrFp@pDh@rEt@vC~@tCr@zBv@jAn@zE~Cz@t@N^~CdC~GzFrDzCtBfB~FjEnCvB`EnDa@p@_G~J}@jAu@nAqDfGeC~DaLtQmLjRmKxPoPjXy@pAO^?JtRlPpEvDnErDtKlJjTdR`ClB`DtClC`CBECDYYVa@v@mAd@w@BEq@i@GDGBQMAE@EDIg@g@"},"summary":"","warnings":["Walking directions are in beta.    Use caution \u2013 This route may be missing sidewalks or pedestrian paths."],"waypoint_order":[]},{"bounds":{"northeast":{"lat":28.71212,"lng":77.431783},"southwest":{"lat":28.66595999999999,"lng":77.1009043}},"copyrights":"Map data ©2018 Google","legs":[{"arrival_time":{"text":"8:59pm","time_zone":"Asia/Calcutta","value":1531322996},"departure_time":{"text":"6:13pm","time_zone":"Asia/Calcutta","value":1531313011},"distance":{"text":"42.7 km","value":42745},"duration":{"text":"2 hours 46 mins","value":9985},"end_address":"Delhi, India","end_location":{"lat":28.704112,"lng":77.1024411},"start_address":"Ghaziabad, Uttar Pradesh, India","start_location":{"lat":28.671886,"lng":77.411377},"steps":[{"distance":{"text":"2.5 km","value":2549},"duration":{"text":"7 mins","value":411},"end_location":{"lat":28.670478,"lng":77.431164},"html_instructions":"Bus towards Ghaziabad Purana Bus Adda","polyline":{"points":"i~~mDclnwMH@Di@N}A?]E][w@_AgB_BiCcAaBC[?SDc@H[L[VYTO|ADvAM\\Ep@W`DoB`@o@x@gClAsDp@_BnEcHbBsCj@oAj@cAv@kAl@q@~@m@dB}@_@o@gAkA{DkDmF{EoBeBQ]]gAUoBg@iGoBoSC@"},"start_location":{"lat":28.671886,"lng":77.411377},"transit_details":{"arrival_stop":{"location":{"lat":28.670478,"lng":77.431164},"name":"Ghaziabad Purana Bus Adda"},"arrival_time":{"text":"6:20pm","time_zone":"Asia/Calcutta","value":1531313422},"departure_stop":{"location":{"lat":28.671886,"lng":77.411377},"name":"Meerut More"},"departure_time":{"text":"6:13pm","time_zone":"Asia/Calcutta","value":1531313011},"headsign":"Ghaziabad Purana Bus Adda","line":{"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"name":"Bhajan Pura - Ghaziabad Purana Bus Adda","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":1},"travel_mode":"TRANSIT"},{"distance":{"text":"0.1 km","value":138},"duration":{"text":"2 mins","value":112},"end_location":{"lat":28.6702133,"lng":77.4312252},"html_instructions":"Walk to Ghaziabad Purana Bus Adda","polyline":{"points":"iu~mDygrwMQqBn@GPlB"},"start_location":{"lat":28.6704515,"lng":77.4311692},"steps":[{"distance":{"text":"56 m","value":56},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.6705376,"lng":77.4317363},"html_instructions":"Head <b>east<\/b> toward <b>Ambedkar Rd<\/b>/<b>Dr Shyam Prasad Mukh Marg<\/b>","polyline":{"points":"iu~mDygrwMQqB"},"start_location":{"lat":28.6704515,"lng":77.4311692},"travel_mode":"WALKING"},{"distance":{"text":"27 m","value":27},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.6702957,"lng":77.431783},"html_instructions":"Turn <b>right<\/b> at <b>Old Bus Stand Chowk<\/b> onto <b>Ambedkar Rd<\/b>/<b>Dr Shyam Prasad Mukh Marg<\/b>","maneuver":"turn-right","polyline":{"points":"{u~mDkkrwMn@G"},"start_location":{"lat":28.6705376,"lng":77.4317363},"travel_mode":"WALKING"},{"distance":{"text":"55 m","value":55},"duration":{"text":"1 min","value":45},"end_location":{"lat":28.6702133,"lng":77.4312252},"html_instructions":"Turn <b>right<\/b> at <b>Old Bus Stand Chowk<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-right","polyline":{"points":"kt~mDskrwMPlB"},"start_location":{"lat":28.6702957,"lng":77.431783},"travel_mode":"WALKING"}],"travel_mode":"WALKING"},{"distance":{"text":"20.2 km","value":20218},"duration":{"text":"1 hour 9 mins","value":4111},"end_location":{"lat":28.709236,"lng":77.24029399999999},"html_instructions":"Bus towards Guru Nanak Sar","polyline":{"points":"ct~mDchrwME@nA~Op@dJLxAN|@b@bAlGvFjEzDfCbC\\`@T^FN}Az@}@n@w@t@i@v@cAbBWd@UXKFe@v@eE~GsAvCeAlC}BfHg@jBcEdTe@tCuBxMcA~FcBnJa@vAuAzGcCbMa@`DIrAu@rFs@hFy@bFy@|Dg@jCu@dFw@~Dk@|CqCdPmCvOQ|BItBUbHAdCAbG@h@Kh@mGhImAjAuE~Dm@h@{@t@oA`AkAt@A@iBbAkD`Bw@ZqG~CgGpC_Bj@OH[N_@RKFABADCDCBKhCSjF]`M}@~Yy@xY?N?@GxCAhFTpCD^B@DDBDBNCRKHEBM^C\\UvGy@`La@nCy@~D[jAg@rAqEfL_BdE_CbGUh@_AhC]jBq@hEEP}@tFyAzIe@rCw@`E_B|Iu@vEeBfKSjBiAdJOhBU|AcAzG_AhGQn@WdBa@xBYpBc@dCa@nCw@lEcAfG_@`CApA?j@BlAB\\LzBt@hGVzAXvAj@rB`@xBNjAT|CBd@FnDAdA_@nE}@fJIr@c@zEAFoBjQW`E]|EEd@o@nKe@zJMrBW`E[rDYlCa@bEg@fFc@~DQ~BS|CaAzOi@nJ[nFGjBQhCSrEg@lNObCOdDw@xQOtEaAxTCb@c@zKMzDOvGAxAAdAA`AO~BQ~Dg@`OWjIYbGSzIFXB`AInCU`BaBvI[fBG`@DHFRHb@@VCXUj@KNWjC[zFg@|KK|E@dCDbBCjDCf@GNKH_At@w@`@_@La@BaA?kALw@b@g@j@[t@cIla@s@nD"},"start_location":{"lat":28.670256,"lng":77.43121699999999},"transit_details":{"arrival_stop":{"location":{"lat":28.709236,"lng":77.24029399999999},"name":"Guru Nanak Sar"},"arrival_time":{"text":"7:43pm","time_zone":"Asia/Calcutta","value":1531318411},"departure_stop":{"location":{"lat":28.670256,"lng":77.43121699999999},"name":"Ghaziabad Purana Bus Adda"},"departure_time":{"text":"6:35pm","time_zone":"Asia/Calcutta","value":1531314300},"headsign":"Guru Nanak Sar","line":{"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"name":"Guru Nanak Sar - Ghaziabad Purana Bus Adda","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":19},"travel_mode":"TRANSIT"},{"distance":{"text":"19.6 km","value":19613},"duration":{"text":"1 hour 5 mins","value":3881},"end_location":{"lat":28.703981,"lng":77.100926},"html_instructions":"Bus towards Avantika Sector 2","polyline":{"points":"wgfnDy~lvM@?gDjPmApFYr@EFWnAuArHeCbM_@rBW~CBf@DPd@f@b@j@L^n@pCBTBl@NxB^lBj@Nl@@h@Gv@QzAMlBIREJrADxCHjA@JJt@J`@\\l@Z`@hA|@|CbBPH`E~AlCjA`Cx@dDjAzGnChAb@hCr@ZFzAZbBTbGl@rANVDJFHD`C`@nBZt@LlFr@|AN^?|BX~BT`AJx@LVFIVq@bDyBbHmAvE{@lD_BdGi@nB_@vAiBtGkAbEeCvJ_F`ReA|DMX_A|Cg@rBoAdFoE|PoC~KiBlHWrAiArDgBlG[jAsCzI[|@IVaAfCg@`Bs@xDcAxEeCxKe@tBk@lBi@|BmDzOCJi@zCSv@?RVz@`@Rd@d@B^Bb@B`@Al@Ub@e@l@KFMFg@SUUQAUNqHhHMPEPAVBXBDLLhB~AzD|C|AzA~@r@r@j@jJ|GhBzAf@h@l@x@Zn@Rf@rAzD|@bDxApFlAbEh@hBh@pBvAtFVvA|Gn_@XlATdAP^`@j@j@`A~@t@b@VlCbAnIbDvBt@z@ZpAf@hCU`@Oz@y@XO^If@BVNbA|@b@d@N^Lx@EbAaDrNw@nD}@`EEDGHMBSA_DkAaA]gFkBsC_AkAW_Do@iAOS@cAz@k@z@ORGPAd@Ff@@Dx@vHPtCAz@WfEg@dIIzAUzDWtE[dGOpBGv@Cd@?@BD?FAHMHEAcDp@wJbCODcIpBoFvA]LSPWZkA|AeArA}AtBaBhCqAtBCT?TXV|BhBdPhMVV`Az@bAv@z@x@OViClEgCjE}@jAu@nAu@jAiDnFaGnJCb@~DfD|@t@nC|BlApAtAjA~ApADBdA|@bFhEtAnAjAbApCbCnB|A^\\p@t@JTWF]RQNu@jAaMjSqBbDiCfEoAvBgDlFU\\sDfGsCtE}GjLx@p@j@d@~FfFtHtGn@j@pA`ArAnAzApA`CrB@C"},"start_location":{"lat":28.709236,"lng":77.24029399999999},"transit_details":{"arrival_stop":{"location":{"lat":28.703981,"lng":77.100926},"name":"Rohini Sector 1 Avantika"},"arrival_time":{"text":"8:57pm","time_zone":"Asia/Calcutta","value":1531322826},"departure_stop":{"location":{"lat":28.709236,"lng":77.24029399999999},"name":"Guru Nanak Sar"},"departure_time":{"text":"7:52pm","time_zone":"Asia/Calcutta","value":1531318945},"headsign":"Avantika Sector 2","line":{"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"short_name":"971","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":44},"travel_mode":"TRANSIT"},{"distance":{"text":"0.2 km","value":227},"duration":{"text":"3 mins","value":169},"end_location":{"lat":28.704112,"lng":77.1024411},"html_instructions":"Walk to Delhi, India","polyline":{"points":"_genDswquMYYVa@RYb@s@FK\\k@BEq@i@A@EBABA?A?A?ECECEE?AA??A?A?A@CDIg@g@"},"start_location":{"lat":28.7039956,"lng":77.1009043},"steps":[{"distance":{"text":"19 m","value":19},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.7041343,"lng":77.1010252},"html_instructions":"Head <b>northeast<\/b> on <b>Sir Chotu Ram Marg<\/b>","polyline":{"points":"_genDswquMYY"},"start_location":{"lat":28.7039956,"lng":77.1009043},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":109},"duration":{"text":"1 min","value":85},"end_location":{"lat":28.7035249,"lng":77.1019008},"html_instructions":"Turn <b>right<\/b> at Shree Sudarshan Electronics","maneuver":"turn-right","polyline":{"points":"ygenDmxquMVa@RYb@s@FK\\k@BE"},"start_location":{"lat":28.7041343,"lng":77.1010252},"travel_mode":"WALKING"},{"distance":{"text":"34 m","value":34},"duration":{"text":"1 min","value":24},"end_location":{"lat":28.7037663,"lng":77.1021109},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"_denD{}quMq@i@"},"start_location":{"lat":28.7035249,"lng":77.1019008},"travel_mode":"WALKING"},{"distance":{"text":"35 m","value":35},"duration":{"text":"1 min","value":25},"end_location":{"lat":28.70391189999999,"lng":77.1022401},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"qeenDe_ruMA@EBABA?A?A?ECECEE?AA??A?A?A@CDI"},"start_location":{"lat":28.7037663,"lng":77.1021109},"travel_mode":"WALKING"},{"distance":{"text":"30 m","value":30},"duration":{"text":"1 min","value":21},"end_location":{"lat":28.704112,"lng":77.1024411},"html_instructions":"Turn <b>left<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-left","polyline":{"points":"mfenD_`ruMg@g@"},"start_location":{"lat":28.70391189999999,"lng":77.1022401},"travel_mode":"WALKING"}],"travel_mode":"WALKING"}],"traffic_speed_entry":[],"via_waypoint":[]}],"overview_polyline":{"points":"i~~mDclnwMH@Di@N{BE][w@_DqFcAaBC[Dw@Vw@l@i@|ADvAMnA]`DoB`@o@fC{Hp@_BnEcHbBsCj@oAbBoCl@q@~@m@dB}@_@o@gAkA{DkD}IaIo@eB}@yJsBmSDAQqBn@GPlBOB`Cd[\\vCb@bAlGvFrI~Hr@`AFN}Az@uBdB{CzEq@~@eE~GsAvCeAlC}BfHg@jBcEdTe@tCyDxUcBnJa@vAyE~Uk@tFiB|MsB`L}ApJcB|I_H|`@[rFUbHAdC?lHKh@mGhIcHjGm@h@kCvBmAv@iBbAcF|ByOpHoBt@iAn@EJOlCiDfjAItKZpDHFFTCRKHSb@YtHy@`La@nCuAjGyMd]uArDoAtHcEvVwC~O{C~Q}ApMe@fEcCdPi@tCaC`O{BtM_@`CApABxBPxClAdJdAjEp@dEXbEFnDAdA_@nEgAzKe@bFoBjQW`Ec@bGuAjWe@tH_ClVu@~HuAxTmAjUe@|Iw@pRyCns@g@~L]rMC~CQ`EqAl_@YbGSzIJzAInCU`B}B~LG`@DHPv@Ap@a@z@WjC[zFg@|KK|EFhFGrESX_At@w@`@aAPaA?kALw@b@g@j@[t@cIla@s@nDeDjPmApFYr@]vA{EvV_@rBW~CHx@hArA|@pDFbANxB^lBj@NvAEv@QzAM`COJrADxCJvAVvAx@nAhA|@|CbBrEhBlCjA`Cx@dDjAdJrDdDz@zAZrMxATLpF|@bH`A|BNxJhAVFIVq@bDyBbHmAvE{CrL_G`TeJx]sAvEgBpGoAdF_J|]aC`KqD`MoDfLoC~HwBrKeCxKqAbFwExSm@fDSjAVz@`@Rd@d@B^FdAAl@Ub@q@t@MFg@SUUQAgIxHSb@@p@PRdH|F|CnC~KhIpCdChAhBfBbFvCtKvBlH`CfJtHfb@n@rCr@jAj@`A~@t@pDzAfMxEz@ZpAf@hCU`@Oz@y@x@Yf@BVNfBbB\\xAEbAaDrNuBpJMNa@@aFiBgFkBsC_AkAW_Do@}AMcAz@k@z@Wd@DlAz@|HPtCAz@_AlOsArV[pEBLORiDn@gKhCsPhEq@^gGbIsD~FCj@tUbRdCrBz@x@OViClEgCjE}@jAkBzCkL~QCb@~DfDlErDbD|CdBtA~JvIlJbI|@jAu@ZgAzAaMjSsNpU{Rf\\zStQ`ClBnD`DbCnBCDYYj@{@j@_A`@q@s@g@KFUQFQg@g@"},"summary":"","warnings":["Walking directions are in beta.    Use caution \u2013 This route may be missing sidewalks or pedestrian paths."],"waypoint_order":[]},{"bounds":{"northeast":{"lat":28.71212,"lng":77.42745239999999},"southwest":{"lat":28.653196,"lng":77.1009043}},"copyrights":"Map data ©2018 Google","legs":[{"arrival_time":{"text":"8:41pm","time_zone":"Asia/Calcutta","value":1531321916},"departure_time":{"text":"6:20pm","time_zone":"Asia/Calcutta","value":1531313400},"distance":{"text":"44.2 km","value":44223},"duration":{"text":"2 hours 22 mins","value":8516},"end_address":"Delhi, India","end_location":{"lat":28.704112,"lng":77.1024411},"start_address":"Ghaziabad, Uttar Pradesh, India","start_location":{"lat":28.653196,"lng":77.427336},"steps":[{"distance":{"text":"11.2 km","value":11225},"duration":{"text":"14 mins","value":840},"end_location":{"lat":28.673301,"lng":77.318291},"html_instructions":"Train towards Delhi Junction","polyline":{"points":"oi{mD{oqwMUUOR}ChEw@dAq@t@u@r@q@j@u@r@{AbB_BjBKHCBC@A@yCdE{ApBgCjDwApBe@n@wCvEcDhGoBhEcBdEw@vBGRGRQh@wBnHq@pCKh@]`BWtA]jBY|A[nBc@bCc@nCa@zBa@vBYvAa@xB]hBIb@_@xB]lBo@rDW|B}@dFs@fEqApHAFADG\\W`BGXa@`Ca@`C]pBa@|Ba@|Ba@bCi@dDYdBSnAWbB]tBi@bDm@jDk@fDe@lCm@jDc@fCo@rDa@bCg@pCOz@O|@qArHgApGeB~Js@fEs@pE_@hCi@`Es@jGYvCUdCWdDWfDUnDEt@GtAIrAEfAGnAG`BAl@GbDI~DArBCrB?`D?zABbH@`EDxIGtC@`@@vB?tB@`@?f@@~AAp@Ah@Az@?nA?n@@bB?d@?bB@~ADlF@~F@bC@lC@|@HfVBtE@pBBpGBrG@dBBpI@fD@|@?v@FvMDdBFtB@|F@hEBbEBpE@jFD`H@bEJxB?`BAvBAfD@lA@lC?pADzGB|FBtFD?"},"start_location":{"lat":28.653196,"lng":77.427336},"transit_details":{"arrival_stop":{"location":{"lat":28.673301,"lng":77.318291},"name":"Vivek Vihar"},"arrival_time":{"text":"6:34pm","time_zone":"Asia/Calcutta","value":1531314240},"departure_stop":{"location":{"lat":28.653196,"lng":77.427336},"name":"Ghaziabad Junction"},"departure_time":{"text":"6:20pm","time_zone":"Asia/Calcutta","value":1531313400},"headsign":"Delhi Junction","line":{"agencies":[{"name":"Indian Railways","url":"http://www.indianrail.gov.in/"}],"name":"EMU Local","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/rail2.png","name":"Train","type":"HEAVY_RAIL"}},"num_stops":2},"travel_mode":"TRANSIT"},{"distance":{"text":"0.8 km","value":788},"duration":{"text":"10 mins","value":578},"end_location":{"lat":28.6756489,"lng":77.3227905},"html_instructions":"Walk to Dilshad Garden Metro Station","polyline":{"points":"ci_nDgf|vMeC@iCAoA@w@@CEAC?GAoAAgC@aC?Q}ACAm@EgJ?K@G?E?CBIH]@EBCBE@C@C@C@E@CFCLEJCD\\`@A@??C?O"},"start_location":{"lat":28.6736157,"lng":77.3182763},"steps":[{"distance":{"text":"0.4 km","value":414},"duration":{"text":"5 mins","value":299},"end_location":{"lat":28.6756998,"lng":77.3201674},"html_instructions":"Head <b>north<\/b><div style=\"font-size:0.9em\">Pass by Print Label Solutions Pvt Ltd (on the right)<\/div>","polyline":{"points":"ci_nDgf|vMeC@iCAoA@w@@CEAC?GAoAAgC@aC?Q"},"start_location":{"lat":28.6736157,"lng":77.3182763},"travel_mode":"WALKING"},{"distance":{"text":"53 m","value":53},"duration":{"text":"1 min","value":38},"end_location":{"lat":28.6761729,"lng":77.3201924},"html_instructions":"Turn <b>left<\/b> toward <b>Apsara Border Chowk<\/b>","maneuver":"turn-left","polyline":{"points":"cv_nDar|vM}AC"},"start_location":{"lat":28.6756998,"lng":77.3201674},"travel_mode":"WALKING"},{"distance":{"text":"0.2 km","value":237},"duration":{"text":"3 mins","value":166},"end_location":{"lat":28.6761218,"lng":77.3226016},"html_instructions":"Turn <b>right<\/b> toward <b>Apsara Border Chowk<\/b><div style=\"font-size:0.9em\">Pass by Haldiram's (on the right in 150&nbsp;m)<\/div>","maneuver":"turn-right","polyline":{"points":"ay_nDer|vMAm@EgJ?K@G?E?CBIH]@E"},"start_location":{"lat":28.6761729,"lng":77.3201924},"travel_mode":"WALKING"},{"distance":{"text":"39 m","value":39},"duration":{"text":"1 min","value":37},"end_location":{"lat":28.6758607,"lng":77.3228326},"html_instructions":"At <b>Apsara Border Chowk<\/b>, take the <b>1st<\/b> exit onto <b>Chaudhary Charan Singh Marg<\/b>/<b>Ghazipur Rd<\/b>","maneuver":"roundabout-left","polyline":{"points":"wx_nDga}vMBCBE@C@C@C@E@CFCLEJC"},"start_location":{"lat":28.6761218,"lng":77.3226016},"travel_mode":"WALKING"},{"distance":{"text":"15 m","value":15},"duration":{"text":"1 min","value":15},"end_location":{"lat":28.6758302,"lng":77.32268479999999},"html_instructions":"Turn <b>right<\/b> toward <b>Apsara Border Footover Bridge<\/b>","maneuver":"turn-right","polyline":{"points":"cw_nDub}vMD\\"},"start_location":{"lat":28.6758607,"lng":77.3228326},"travel_mode":"WALKING"},{"distance":{"text":"30 m","value":30},"duration":{"text":"1 min","value":23},"end_location":{"lat":28.6756489,"lng":77.3227905},"html_instructions":"Take the pedestrian overpass","polyline":{"points":"}v_nDwa}vM`@A@??C?O"},"start_location":{"lat":28.6758302,"lng":77.32268479999999},"travel_mode":"WALKING"}],"travel_mode":"WALKING"},{"distance":{"text":"32.0 km","value":31983},"duration":{"text":"1 hour 47 mins","value":6422},"end_location":{"lat":28.703981,"lng":77.100926},"html_instructions":"Bus towards Avantika Sector 2","polyline":{"points":"uu_nDmb}vM?Ia@?WDUHCHINKLSHS?OCMI_@k@[[QKcAY_Be@kEoAk@]s@q@m@q@MWOYsB{Eo@oBaBiG_@eAEi@?OA?EAEEEK@G?As@{AmCsIu@uB]s@a@o@Wa@UMI?mGbAmEt@i@JwCn@eAZuCz@eBn@sBt@aAd@}Bv@uAx@qJzFuD~B}@j@VZdGxIf@r@hDbFjBlCxAlB|C`DtCvCp@z@VXXPm@x@i@x@kAnB[b@c@^KJ_MrI{A`AoGdE_GvDWP?DADCFMDKEACaBWwASEAcCUcDa@yBOMrAIx@o@hH]zCc@zEAFoBjQW`E]|E[dEs@hNMtCANUnDg@tGw@xH_AlJY|CGr@S|CgA~Qc@jH[nFGjBQhCFH}Ad]_A`TM|CAJa@~J]xHWrFWtHMpEIpFCzBEz@IpAQ|DQlGUvFUjHAZOdDSnFInEJh@?`@GlBEbAKn@aAfF_ApFI`@BBBHBHHZBX?XQl@ORCDWjCALo@dMY`IC`B@vBBdA@n@CdECLQRc@\\}@n@m@RUDu@Da@Ak@B{@Ta@TWVU`@Qp@sJpf@?BgDjPmApFYr@EFWnAuArHeCbM_@rBW~CBf@DPd@f@b@j@L^n@pCBTBl@NxB^lBj@Nl@@h@Gv@QzAMlBIREJrADxCHjA@JJt@J`@\\l@Z`@hA|@|CbBPH`E~AlCjA`Cx@dDjAzGnChAb@hCr@ZFzAZbBTbGl@rANVDJFHD`C`@nBZt@LlFr@|AN^?|BX~BT`AJx@LVFIVq@bDyBbHmAvE{@lD_BdGi@nB_@vAiBtGkAbEeCvJ_F`ReA|DMX_A|Cg@rBoAdFoE|PoC~KiBlHWrAiArDgBlG[jAsCzI[|@IVaAfCg@`Bs@xDcAxEeCxKe@tBk@lBi@|BmDzOCJi@zCSv@?RVz@`@Rd@d@B^Bb@B`@Al@Ub@e@l@KFMFg@SUUQAUNqHhHMPEPAVBXBDLLhB~AzD|C|AzA~@r@r@j@jJ|GhBzAf@h@l@x@Zn@Rf@rAzD|@bDxApFlAbEh@hBh@pBvAtFVvA|Gn_@XlATdAP^`@j@j@`A~@t@b@VlCbAnIbDvBt@z@ZpAf@hCU`@Oz@y@XO^If@BVNbA|@b@d@N^Lx@EbAaDrNw@nD}@`EEDGHMBSA_DkAaA]gFkBsC_AkAW_Do@iAOS@cAz@k@z@ORGPAd@Ff@@Dx@vHPtCAz@WfEg@dIIzAUzDWtE[dGOpBGv@Cd@?@BD?FAHMHEAcDp@wJbCODcIpBoFvA]LSPWZkA|AeArA}AtBaBhCqAtBCT?TXV|BhBdPhMVV`Az@bAv@z@x@OViClEgCjE}@jAu@nAu@jAiDnFaGnJCb@~DfD|@t@nC|BlApAtAjA~ApADBdA|@bFhEtAnAjAbApCbCnB|A^\\p@t@JTWF]RQNu@jAaMjSqBbDiCfEoAvBgDlFU\\sDfGsCtE}GjLx@p@j@d@~FfFtHtGn@j@pA`ArAnAzApA`CrB@C"},"start_location":{"lat":28.675632,"lng":77.32279},"transit_details":{"arrival_stop":{"location":{"lat":28.703981,"lng":77.100926},"name":"Rohini Sector 1 Avantika"},"arrival_time":{"text":"8:39pm","time_zone":"Asia/Calcutta","value":1531321746},"departure_stop":{"location":{"lat":28.675632,"lng":77.32279},"name":"Dilshad Garden Metro Station"},"departure_time":{"text":"6:52pm","time_zone":"Asia/Calcutta","value":1531315324},"headsign":"Avantika Sector 2","line":{"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"short_name":"971","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":71},"travel_mode":"TRANSIT"},{"distance":{"text":"0.2 km","value":227},"duration":{"text":"3 mins","value":169},"end_location":{"lat":28.704112,"lng":77.1024411},"html_instructions":"Walk to Delhi, India","polyline":{"points":"_genDswquMYYVa@RYb@s@FK\\k@BEq@i@A@EBABA?A?A?ECECEE?AA??A?A?A@CDIg@g@"},"start_location":{"lat":28.7039956,"lng":77.1009043},"steps":[{"distance":{"text":"19 m","value":19},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.7041343,"lng":77.1010252},"html_instructions":"Head <b>northeast<\/b> on <b>Sir Chotu Ram Marg<\/b>","polyline":{"points":"_genDswquMYY"},"start_location":{"lat":28.7039956,"lng":77.1009043},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":109},"duration":{"text":"1 min","value":85},"end_location":{"lat":28.7035249,"lng":77.1019008},"html_instructions":"Turn <b>right<\/b> at Shree Sudarshan Electronics","maneuver":"turn-right","polyline":{"points":"ygenDmxquMVa@RYb@s@FK\\k@BE"},"start_location":{"lat":28.7041343,"lng":77.1010252},"travel_mode":"WALKING"},{"distance":{"text":"34 m","value":34},"duration":{"text":"1 min","value":24},"end_location":{"lat":28.7037663,"lng":77.1021109},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"_denD{}quMq@i@"},"start_location":{"lat":28.7035249,"lng":77.1019008},"travel_mode":"WALKING"},{"distance":{"text":"35 m","value":35},"duration":{"text":"1 min","value":25},"end_location":{"lat":28.70391189999999,"lng":77.1022401},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"qeenDe_ruMA@EBABA?A?A?ECECEE?AA??A?A?A@CDI"},"start_location":{"lat":28.7037663,"lng":77.1021109},"travel_mode":"WALKING"},{"distance":{"text":"30 m","value":30},"duration":{"text":"1 min","value":21},"end_location":{"lat":28.704112,"lng":77.1024411},"html_instructions":"Turn <b>left<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-left","polyline":{"points":"mfenD_`ruMg@g@"},"start_location":{"lat":28.70391189999999,"lng":77.1022401},"travel_mode":"WALKING"}],"travel_mode":"WALKING"}],"traffic_speed_entry":[],"via_waypoint":[]}],"overview_polyline":{"points":"oi{mD{oqwMUUORuEnGgBhBgB~AkE|E{FzH_F|G}DfGcDhGoBhE{C|HyC`K}@zDu@vDwB|LaCzMiB`KmA`HW|B}@dFeCxNCLiAzGcCnNyB~MmChPcDhRyKho@gBxKiAjImAbLm@jH{@bN_@lIUdOCtGB~JFzOEvDBvH?pCCdB@hGXhv@Vjo@FnOLzEJ|YFlO@bEJxBAxE?tFJxVBtFD?eEByE?w@@CEAKCwE@sC}ACAm@EsJ@MNq@JQLQXID\\`@A@??SBIy@DUHCHU\\SHS?]M{@gAuAe@kHuBk@]s@q@{@iAcCuFo@oBaBiG_@eAEy@GAKQ@Is@{AmCsIu@uB_AcBWa@UMwGbAwF`A}EjA{FjBuDzA}Bv@uAx@gPzJ}@j@VZlHlKtGpJxAlB|C`DfErEVXXPwArBgBrCo@j@{OtKoO|JWP?DELMDKEcB[}AUgHw@yBOMrAy@bJaAvJqBrQu@~K[dEs@hNOdD}@dMyCxZ{Cxg@GjBQhCFH}Cfr@OhD_AxTo@hPWbMCzBOlCc@jM}@dV]~LJh@?`@MpDmAvGiArGFLLd@Br@Ql@OR[pCq@rM]bLD|DAtFCLQRaBlAcAXwABk@B{@Ty@l@U`@Qp@sJtf@uF|W_@z@sGz\\W~CBf@DPd@f@b@j@L^r@fDBl@NxB^lBj@Nl@@`BYhEWREJrADxCHjAL`AJ`@\\l@Z`@hA|@nDlBnIjD`Cx@dDjAzGnChAb@hCr@vBb@zLrAb@LjCf@dDh@jIbA^?|BX`E`@pAT{@zDyBbHiCdKsGbVwNzi@mAvDg@rB_HbXyFlUWrAiArDcCxIoDxKkA~Cg@`Bs@xDiErRe@tBuAjFqDfP}@rE?RVz@`@Rd@d@FbA@nAUb@e@l@YNg@SUUQAUN_IzHGh@F^vBlBzD|C|AzArB~AjJ|GhBzAtAbBn@vArAzD|@bDfDtLrAzEvAtFVvAvH|a@TdAP^lAlBbBlA|MfFdGxBhCU`@Oz@y@XO^If@BzAlAb@d@N^Lx@EbAyEbTcAfEULSA_DkAaA]{JkDkAWiF_AS@cAz@{@nAGPAd@Hl@x@vHPtCYbG_BrXw@tMBFAPSFcDp@wJbCsIvBmGdBk@l@qCpD}AtBaBhCqAtBCT?TXVbTrPxArA~BpBaHpL}@jAu@nA_FzHaGnJCb@|F|EnC|BlApAtD|CdKzIlIdHpArAJTWFo@b@u@jAmWnb@eOhV}GjLx@p@jHlGdJ`IpA`ArAnA|EdEA@YYVa@v@mAd@w@BEq@i@GDCBICMK@IDIg@g@"},"summary":"","warnings":["Walking directions are in beta.    Use caution \u2013 This route may be missing sidewalks or pedestrian paths."],"waypoint_order":[]},{"bounds":{"northeast":{"lat":28.704112,"lng":77.42745239999999},"southwest":{"lat":28.653196,"lng":77.0937}},"copyrights":"Map data ©2018 Google","legs":[{"arrival_time":{"text":"8:36pm","time_zone":"Asia/Calcutta","value":1531321586},"departure_time":{"text":"6:20pm","time_zone":"Asia/Calcutta","value":1531313400},"distance":{"text":"39.5 km","value":39516},"duration":{"text":"2 hours 16 mins","value":8186},"end_address":"Delhi, India","end_location":{"lat":28.704112,"lng":77.1024411},"start_address":"Ghaziabad, Uttar Pradesh, India","start_location":{"lat":28.653196,"lng":77.427336},"steps":[{"distance":{"text":"13.8 km","value":13766},"duration":{"text":"19 mins","value":1140},"end_location":{"lat":28.672868,"lng":77.29228599999999},"html_instructions":"Train towards Delhi Junction","polyline":{"points":"oi{mD{oqwMUUOR}ChEw@dAq@t@u@r@q@j@u@r@{AbB_BjBKHCBC@A@yCdE{ApBgCjDwApBe@n@wCvEcDhGoBhEcBdEw@vBGRGRQh@wBnHq@pCKh@]`BWtA]jBY|A[nBc@bCc@nCa@zBa@vBYvAa@xB]hBIb@_@xB]lBo@rDW|B}@dFs@fEqApHAFADG\\W`BGXa@`Ca@`C]pBa@|Ba@|Ba@bCi@dDYdBSnAWbB]tBi@bDm@jDk@fDe@lCm@jDc@fCo@rDa@bCg@pCOz@O|@qArHgApGeB~Js@fEs@pE_@hCi@`Es@jGYvCUdCWdDWfDUnDEt@GtAIrAEfAGnAG`BAl@GbDI~DArBCrB?`D?zABbH@`EDxIGtC@`@@vB?tB@`@?f@@~AAp@Ah@Az@?nA?n@@bB?d@?bB@~ADlF@~F@bC@lC@|@HfVBtE@pBBpGBrG@dBBpI@fD@|@?v@FvMDdBFtB@|F@hEBbEBpE@jFD`H@bEJxB?`BAvBAfD@lA@lC?pADzGB|FBtF@hF@hB@fB@|@@bIDjMHjX?zADtG@`G@hD?j@Fv@Bn@@zDBdDB~C@pBBrE@dCBhDBzC@dB@bCEtA@pB@dCBdF@v@HA"},"start_location":{"lat":28.653196,"lng":77.427336},"transit_details":{"arrival_stop":{"location":{"lat":28.672868,"lng":77.29228599999999},"name":"Delhi Shahdara JN."},"arrival_time":{"text":"6:39pm","time_zone":"Asia/Calcutta","value":1531314540},"departure_stop":{"location":{"lat":28.653196,"lng":77.427336},"name":"Ghaziabad Junction"},"departure_time":{"text":"6:20pm","time_zone":"Asia/Calcutta","value":1531313400},"headsign":"Delhi Junction","line":{"agencies":[{"name":"Indian Railways","url":"http://www.indianrail.gov.in/"}],"name":"EMU Local","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/rail2.png","name":"Train","type":"HEAVY_RAIL"}},"num_stops":3},"travel_mode":"TRANSIT"},{"distance":{"text":"0.4 km","value":409},"duration":{"text":"5 mins","value":319},"end_location":{"lat":28.6758114,"lng":77.2939646},"html_instructions":"Walk to Loni Road More","polyline":{"points":"md_nDycwvMaCRmC~@iAs@QKYQWQKVg@WECEAGAG?{@@Kk@Ko@Ee@?CEg@Ag@@c@?Y?I@Y"},"start_location":{"lat":28.672868,"lng":77.29228599999999},"steps":[{"distance":{"text":"73 m","value":73},"duration":{"text":"1 min","value":74},"end_location":{"lat":28.673525,"lng":77.292187},"html_instructions":"Take exit <span class=\"location\">Delhi Shahdara Junction<\/span>","polyline":{"points":"md_nDycwvMaCR"},"start_location":{"lat":28.672868,"lng":77.29228599999999},"travel_mode":"WALKING"},{"distance":{"text":"92 m","value":92},"duration":{"text":"1 min","value":72},"end_location":{"lat":28.6749368,"lng":77.29237330000001},"html_instructions":"Head <b>northeast<\/b>","polyline":{"points":"}l_nDeawvMiAs@QKYQWQ"},"start_location":{"lat":28.6742338,"lng":77.29186779999999},"travel_mode":"WALKING"},{"distance":{"text":"14 m","value":14},"duration":{"text":"1 min","value":12},"end_location":{"lat":28.675005,"lng":77.2922485},"html_instructions":"Turn <b>left<\/b> toward <b>SH 57<\/b>","maneuver":"turn-left","polyline":{"points":"kq_nDidwvMKV"},"start_location":{"lat":28.6749368,"lng":77.29237330000001},"travel_mode":"WALKING"},{"distance":{"text":"74 m","value":74},"duration":{"text":"1 min","value":52},"end_location":{"lat":28.6756381,"lng":77.29239559999999},"html_instructions":"Turn <b>right<\/b> toward <b>SH 57<\/b>","maneuver":"turn-right","polyline":{"points":"wq_nDqcwvMg@WECEAGAG?{@@"},"start_location":{"lat":28.675005,"lng":77.2922485},"travel_mode":"WALKING"},{"distance":{"text":"0.2 km","value":156},"duration":{"text":"2 mins","value":109},"end_location":{"lat":28.6758114,"lng":77.2939646},"html_instructions":"Turn <b>right<\/b> onto <b>SH 57<\/b><div style=\"font-size:0.9em\">Pass by State Bank of India (on the right in 90&nbsp;m)<\/div><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-right","polyline":{"points":"wu_nDodwvMKk@Ko@Ee@?CEg@Ag@@c@?Y?I@Y"},"start_location":{"lat":28.6756381,"lng":77.29239559999999},"travel_mode":"WALKING"}],"travel_mode":"WALKING"},{"distance":{"text":"21.8 km","value":21762},"duration":{"text":"1 hour 15 mins","value":4471},"end_location":{"lat":28.67952,"lng":77.09369699999999},"html_instructions":"Bus towards Qamruddin Nagar","polyline":{"points":"sv_nDgnwvME?Ab@A|@FnAPxAp@dE~@rG~AvJbAdGlDtSr@bDDXRjAZrBJjD@rAFr@?r@R`Gn@tGB\\dA`LhDl_@VzDLrAj@rGf@fFNp@@FRx@DpA^bAFP\\hCFx@?b@Cz@Qx@Sj@Wj@sA`B{@dAy@~@k@dAc@tAYxAw@hJw@|HqAvNa@nEoCrY]rD]tD_@xES|D?tBDlAPlB?@VfBn@pCp@dChEvO^zARv@fH|Vn@bCbB|IzCrQb@xBhBzHzAlIZhBbBlJj@xDLt@TzAZfC|@rHHv@FzAUnDiA|ICNQdAYjCCx@AZOvBOhBCjAF~ANnBAPOx@Cd@i@hD?dADPLLb@RvAZb@JpCz@~C|@xBl@jAZd@LvC~@p@XrBl@n@R]rCUtDt@b@xAr@|@l@r@v@|@lAp@`AZXVPrDbBn@Nd@BT?^Ab@G`Bk@fDcAPGZIxAUdFq@DQHKLGLAJ@JFJR@NANEJt@j@BJ|FfEJ@NHGNiEvJcAnBaBjEwCxHqAbDyDbJyAhDgBrDM\\iAvD}@rD{EnSWbAqDnOOj@_B|Gg@~AO^k@t@i@j@yA|Aa@f@[l@Yr@Ot@M~@a@`Ic@zFS|AW~AWdAUp@Yv@c@lAqChGsA~C[rAQlAEfBCtAMjCWrA]lA_ApC_F|NiBdF?@m@fBcArCkIzWQx@aAlJ]`CWvCeApKGbAMrAGj@Gt@a@nDUlDKdAw@|JKvB_@nESvDoApQEp@i@`Iu@lJi@|Ii@dK}@tMGr@_AhNCZqAjSmAhRUhD_Cj][zEYnEo@rJwAjTcDnf@QdC_A~Mo@fKSnDeAfRInAa@fHS|D"},"start_location":{"lat":28.675783,"lng":77.29396299999999},"transit_details":{"arrival_stop":{"location":{"lat":28.67952,"lng":77.09369699999999},"name":"Peeragarhi Metro Station"},"arrival_time":{"text":"8:06pm","time_zone":"Asia/Calcutta","value":1531319796},"departure_stop":{"location":{"lat":28.675783,"lng":77.29396299999999},"name":"Loni Road More"},"departure_time":{"text":"6:52pm","time_zone":"Asia/Calcutta","value":1531315325},"headsign":"Qamruddin Nagar","line":{"agencies":[{"name":"DIMTS","phone":"011 91 11 4309 0100","url":"http://businfo.dimts.in/businfo/"}],"short_name":"236","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":46},"travel_mode":"TRANSIT"},{"distance":{"text":"0.2 km","value":202},"duration":{"text":"3 mins","value":201},"end_location":{"lat":28.6803246,"lng":77.0943679},"html_instructions":"Walk to Peera Garhi","polyline":{"points":"_n`nDsjpuMBg@HiBm@Ia@CDJDR@HM?}AO"},"start_location":{"lat":28.6795206,"lng":77.0936971},"steps":[{"distance":{"text":"72 m","value":72},"duration":{"text":"1 min","value":54},"end_location":{"lat":28.6794458,"lng":77.09442779999999},"html_instructions":"Head <b>east<\/b> on <b>NH9<\/b>","polyline":{"points":"_n`nDsjpuMBg@HiB"},"start_location":{"lat":28.6795206,"lng":77.0936971},"travel_mode":"WALKING"},{"distance":{"text":"46 m","value":46},"duration":{"text":"1 min","value":63},"end_location":{"lat":28.6798532,"lng":77.0945004},"html_instructions":"Turn <b>left<\/b> at <b>Peera Garhi Chowk<\/b> to stay on <b>NH9<\/b>","maneuver":"turn-left","polyline":{"points":"qm`nDeopuMm@Ia@C"},"start_location":{"lat":28.6794458,"lng":77.09442779999999},"travel_mode":"WALKING"},{"distance":{"text":"23 m","value":23},"duration":{"text":"1 min","value":26},"end_location":{"lat":28.6797779,"lng":77.0942858},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"ap`nDsopuMDJDR@H"},"start_location":{"lat":28.6798532,"lng":77.0945004},"travel_mode":"WALKING"},{"distance":{"text":"61 m","value":61},"duration":{"text":"1 min","value":58},"end_location":{"lat":28.6803246,"lng":77.0943679},"html_instructions":"Turn <b>right<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-right","polyline":{"points":"so`nDinpuMM?}AO"},"start_location":{"lat":28.6797779,"lng":77.0942858},"travel_mode":"WALKING"}],"travel_mode":"WALKING"},{"distance":{"text":"2.4 km","value":2402},"duration":{"text":"8 mins","value":471},"end_location":{"lat":28.698598,"lng":77.09648899999999},"html_instructions":"Bus towards Bawana","polyline":{"points":"_s`nDcopuMB_@sCYqE_@aC_@gA[i@GmD[qIs@aK}@sFk@mDs@KEqCsAoCeCCCkDqE_BeEi@wBY_@UA{AX}O|Dy@P_@Hg@f@yDdGiCxEHF"},"start_location":{"lat":28.680318,"lng":77.094421},"transit_details":{"arrival_stop":{"location":{"lat":28.698598,"lng":77.09648899999999},"name":"Avantika Crossing"},"arrival_time":{"text":"8:23pm","time_zone":"Asia/Calcutta","value":1531320812},"departure_stop":{"location":{"lat":28.680318,"lng":77.094421},"name":"Peera Garhi"},"departure_time":{"text":"8:15pm","time_zone":"Asia/Calcutta","value":1531320341},"headsign":"Bawana","line":{"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"short_name":"972A","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":4},"travel_mode":"TRANSIT"},{"distance":{"text":"1.0 km","value":975},"duration":{"text":"13 mins","value":774},"end_location":{"lat":28.704112,"lng":77.1024411},"html_instructions":"Walk to Delhi, India","polyline":{"points":"qednDk|puMDIJOMIoBqAy@k@mA{@mAo@gAy@gAy@CAiAw@iAu@w@k@g@]MI]WoAaAf@u@b@w@f@u@_GeFBEq@i@A@EBABA?A?A?ECECEE?AA??A?A?A@CDIg@g@"},"start_location":{"lat":28.6986541,"lng":77.0965358},"steps":[{"distance":{"text":"17 m","value":17},"duration":{"text":"1 min","value":16},"end_location":{"lat":28.6985647,"lng":77.0966711},"html_instructions":"Head <b>southeast<\/b> on <b>Guru Gowalkar Marg<\/b>/<b>Kanjhawala Rd<\/b> toward <b>Sir Chotu Ram Marg<\/b>","polyline":{"points":"qednDk|puMDIJO"},"start_location":{"lat":28.6986541,"lng":77.0965358},"travel_mode":"WALKING"},{"distance":{"text":"0.6 km","value":570},"duration":{"text":"8 mins","value":470},"end_location":{"lat":28.7028356,"lng":77.0998956},"html_instructions":"Turn <b>left<\/b> onto <b>Sir Chotu Ram Marg<\/b><div style=\"font-size:0.9em\">Pass by M.C. Primary School (on the right in 450&nbsp;m)<\/div>","maneuver":"turn-left","polyline":{"points":"_ednDe}puMMIoBqAy@k@mA{@mAo@gAy@gAy@CAiAw@iAu@w@k@g@]MI]WoAaA"},"start_location":{"lat":28.6985647,"lng":77.0966711},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":103},"duration":{"text":"1 min","value":82},"end_location":{"lat":28.7022592,"lng":77.1007161},"html_instructions":"Turn <b>right<\/b>","maneuver":"turn-right","polyline":{"points":"w_enDkqquMf@u@b@w@f@u@"},"start_location":{"lat":28.7028356,"lng":77.0998956},"travel_mode":"WALKING"},{"distance":{"text":"0.2 km","value":182},"duration":{"text":"2 mins","value":132},"end_location":{"lat":28.7035444,"lng":77.10187189999999},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"c|dnDovquM_GeF"},"start_location":{"lat":28.7022592,"lng":77.1007161},"travel_mode":"WALKING"},{"distance":{"text":"4 m","value":4},"duration":{"text":"1 min","value":4},"end_location":{"lat":28.7035249,"lng":77.1019008},"html_instructions":"Turn <b>right<\/b>","maneuver":"turn-right","polyline":{"points":"cdenDu}quMBE"},"start_location":{"lat":28.7035444,"lng":77.10187189999999},"travel_mode":"WALKING"},{"distance":{"text":"34 m","value":34},"duration":{"text":"1 min","value":24},"end_location":{"lat":28.7037663,"lng":77.1021109},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"_denD{}quMq@i@"},"start_location":{"lat":28.7035249,"lng":77.1019008},"travel_mode":"WALKING"},{"distance":{"text":"35 m","value":35},"duration":{"text":"1 min","value":25},"end_location":{"lat":28.70391189999999,"lng":77.1022401},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"qeenDe_ruMA@EBABA?A?A?ECECEE?AA??A?A?A@CDI"},"start_location":{"lat":28.7037663,"lng":77.1021109},"travel_mode":"WALKING"},{"distance":{"text":"30 m","value":30},"duration":{"text":"1 min","value":21},"end_location":{"lat":28.704112,"lng":77.1024411},"html_instructions":"Turn <b>left<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-left","polyline":{"points":"mfenD_`ruMg@g@"},"start_location":{"lat":28.70391189999999,"lng":77.1022401},"travel_mode":"WALKING"}],"travel_mode":"WALKING"}],"traffic_speed_entry":[],"via_waypoint":[]}],"overview_polyline":{"points":"oi{mD{oqwMUUORuEnGgBhBgB~A{DnEOLEBuFvH_F|Ge@n@wCvEcDhGoBhE{C|HyC`K}@zDu@vDwB|LaCzMiB`KmA`HW|B}@dFeCxNCLiAzGcCnNyB~Mu@xEwAnIcDhRyKho@gBxKiAjImAbLm@jHm@vIMjC_@lIIpEKrHCtGB~JFzOEvDBvH?pCCdB@hGXhv@Vjo@FnOLzEJ|YFlO@bEJxBAxE?tFJxVHpT\\vkA?j@Fv@DjFLjSJpP@bCEtABvFD|GHAaCRmC~@iAs@k@]WQKVm@[MCcA@W{AEi@GoA@}@@c@D?E?C`BFnAPxApBxMbD|RlDtSr@bDXdBZrBJjD@rAFr@?r@R`Gr@rHnFnl@d@nGrAzNPx@Rx@DpAf@tA\\hCFx@C~AQx@Sj@Wj@sA`BuBdCk@dAc@tAYxAw@hJiCtXmFlk@_@xES|D?tBDlAPnBVfBn@pCzF|Sr@rCvI`[bB|IzCrQb@xBhBzHvBvLbBlJj@xDb@pCxAzLHv@FzAUnDiA|IUtAYjCCx@QrCOhBCjAVnEQjACd@i@hD?dADPLLb@RzBf@pHxBdEhA|DlAp@XrBl@n@R]rCUtDnCvA|@l@r@v@nBnCr@j@rDbBn@Nz@B^Ab@GhGoBl@Q~HgADQHKZIVHJR@NGZt@j@BJ|FfEJ@NHGNiEvJcAnBaBjEiF|MyDbJyAhDgBrDwAtE}@rDuLng@_B|Gg@~AO^k@t@cChCa@f@[l@Yr@Ot@M~@a@`Ic@zFS|AW~AWdAo@hBc@lAqChGsA~C[rAQlAEfBQ`FWrA]lA_HnSiBfFqBzFkIzWQx@aAlJ]`CWvCeApKGbAU~Bi@dFa@rFw@|JKvB_@nESvDuAbSi@`Iu@lJsAbVeAhOcFzv@qDpi@eI~mAqAdRcAvPeC|c@Bg@HiBm@Ia@CDJF\\kBOBi@eJy@aC_@gA[wEc@sUqBsFk@mDs@}CyAsCiCkDqE_BeEi@wBY_@UA{AXwQnE_@Hg@f@yDdGiCxEHFIIPYeGcEmAo@gAy@kA{@sCmB_BiAk@a@oAaAf@u@jAmB_GeFBEq@i@A@GFE?QOAEFMg@g@"},"summary":"","warnings":["Walking directions are in beta.    Use caution \u2013 This route may be missing sidewalks or pedestrian paths."],"waypoint_order":[]}]
     * status : OK
     */

    private String status;
    private List<GeocodedWaypointsBean> geocoded_waypoints;
    private List<RoutesBean> routes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<GeocodedWaypointsBean> getGeocoded_waypoints() {
        return geocoded_waypoints;
    }

    public void setGeocoded_waypoints(List<GeocodedWaypointsBean> geocoded_waypoints) {
        this.geocoded_waypoints = geocoded_waypoints;
    }

    public List<RoutesBean> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RoutesBean> routes) {
        this.routes = routes;
    }

    public static class GeocodedWaypointsBean {
        /**
         * geocoder_status : OK
         * place_id : ChIJ3w_FQbvxDDkRuph3atJv8OY
         * types : ["locality","political"]
         */

        private String geocoder_status;
        private String place_id;
        private List<String> types;

        public String getGeocoder_status() {
            return geocoder_status;
        }

        public void setGeocoder_status(String geocoder_status) {
            this.geocoder_status = geocoder_status;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }
    }

    public static class RoutesBean {
        /**
         * bounds : {"northeast":{"lat":28.73764,"lng":77.431783},"southwest":{"lat":28.66595999999999,"lng":77.10089900000001}}
         * copyrights : Map data ©2018 Google
         * legs : [{"arrival_time":{"text":"8:48pm","time_zone":"Asia/Calcutta","value":1531322306},"departure_time":{"text":"6:13pm","time_zone":"Asia/Calcutta","value":1531313011},"distance":{"text":"41.2 km","value":41187},"duration":{"text":"2 hours 35 mins","value":9295},"end_address":"Delhi, India","end_location":{"lat":28.704112,"lng":77.1024411},"start_address":"Ghaziabad, Uttar Pradesh, India","start_location":{"lat":28.671886,"lng":77.411377},"steps":[{"distance":{"text":"2.5 km","value":2549},"duration":{"text":"7 mins","value":411},"end_location":{"lat":28.670478,"lng":77.431164},"html_instructions":"Bus towards Ghaziabad Purana Bus Adda","polyline":{"points":"i~~mDclnwMH@Di@N}A?]E][w@_AgB_BiCcAaBC[?SDc@H[L[VYTO|ADvAM\\Ep@W`DoB`@o@x@gClAsDp@_BnEcHbBsCj@oAj@cAv@kAl@q@~@m@dB}@_@o@gAkA{DkDmF{EoBeBQ]]gAUoBg@iGoBoSC@"},"start_location":{"lat":28.671886,"lng":77.411377},"transit_details":{"arrival_stop":{"location":{"lat":28.670478,"lng":77.431164},"name":"Ghaziabad Purana Bus Adda"},"arrival_time":{"text":"6:20pm","time_zone":"Asia/Calcutta","value":1531313422},"departure_stop":{"location":{"lat":28.671886,"lng":77.411377},"name":"Meerut More"},"departure_time":{"text":"6:13pm","time_zone":"Asia/Calcutta","value":1531313011},"headsign":"Ghaziabad Purana Bus Adda","line":{"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"name":"Bhajan Pura - Ghaziabad Purana Bus Adda","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":1},"travel_mode":"TRANSIT"},{"distance":{"text":"0.1 km","value":138},"duration":{"text":"2 mins","value":112},"end_location":{"lat":28.6702133,"lng":77.4312252},"html_instructions":"Walk to Ghaziabad Purana Bus Adda","polyline":{"points":"iu~mDygrwMQqBn@GPlB"},"start_location":{"lat":28.6704515,"lng":77.4311692},"steps":[{"distance":{"text":"56 m","value":56},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.6705376,"lng":77.4317363},"html_instructions":"Head <b>east<\/b> toward <b>Ambedkar Rd<\/b>/<b>Dr Shyam Prasad Mukh Marg<\/b>","polyline":{"points":"iu~mDygrwMQqB"},"start_location":{"lat":28.6704515,"lng":77.4311692},"travel_mode":"WALKING"},{"distance":{"text":"27 m","value":27},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.6702957,"lng":77.431783},"html_instructions":"Turn <b>right<\/b> at <b>Old Bus Stand Chowk<\/b> onto <b>Ambedkar Rd<\/b>/<b>Dr Shyam Prasad Mukh Marg<\/b>","maneuver":"turn-right","polyline":{"points":"{u~mDkkrwMn@G"},"start_location":{"lat":28.6705376,"lng":77.4317363},"travel_mode":"WALKING"},{"distance":{"text":"55 m","value":55},"duration":{"text":"1 min","value":45},"end_location":{"lat":28.6702133,"lng":77.4312252},"html_instructions":"Turn <b>right<\/b> at <b>Old Bus Stand Chowk<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-right","polyline":{"points":"kt~mDskrwMPlB"},"start_location":{"lat":28.6702957,"lng":77.431783},"travel_mode":"WALKING"}],"travel_mode":"WALKING"},{"distance":{"text":"17.1 km","value":17087},"duration":{"text":"58 mins","value":3474},"end_location":{"lat":28.702937,"lng":77.269965},"html_instructions":"Bus towards Bhajan Pura","polyline":{"points":"ct~mDchrwMI@rA~Op@dJLxAN|@b@bAlGvFjEzDfCbC\\`@T^FN}Az@}@n@w@t@i@v@cAbBWd@UXKFe@v@eE~GsAvCeAlC}BfHg@jBcEdTe@tCuBxMcA~FcBnJa@vAuAzGcCbMa@`DIrAu@rFs@hFy@bFy@|Dg@jCu@dFw@~Dk@|CqCdPmCvOQ|BItBKhLE`GGh@_@v@wF|HmAjAuE~Dm@h@{@t@oA`AkAt@A@iBbAkD`Bw@ZqG~CgGpC_Bj@OH[N_@RKFABADCDCBKhCSjF]`M}@~Yy@xY?N?@GxCAhFTpCD^B@DDBDBNCRKHEBM^C\\UvGy@`La@nCy@~D[jAg@rAqEfL_BdE_CbGUh@_AhC]jBq@hEEP}@tFyAzIe@rCw@`E_B|Iu@vEeBfKSjBiAdJOhBU|AcAzG_AhGQn@WdBa@xBYpBc@dCa@nCw@lEcAfG_@`CApA?j@BlAB\\LzBt@hGVzAXvAj@rB`@xBNjAT|CLrDE~BWlCEh@}@fJIr@c@zEAFoBjQW`E]|EEd@o@nKe@zJMrBW`E[rDYlCa@bEg@fFc@~DQ~BS|CaAzOi@nJ[nFGjBQhCSrEg@lNObCOdDw@xQOtEaAxTCb@c@zKMzDOvGAxAE?"},"start_location":{"lat":28.670256,"lng":77.43121699999999},"transit_details":{"arrival_stop":{"location":{"lat":28.702937,"lng":77.269965},"name":"B Block Yamuna Vihar"},"arrival_time":{"text":"7:27pm","time_zone":"Asia/Calcutta","value":1531317474},"departure_stop":{"location":{"lat":28.670256,"lng":77.43121699999999},"name":"Ghaziabad Purana Bus Adda"},"departure_time":{"text":"6:30pm","time_zone":"Asia/Calcutta","value":1531314000},"headsign":"Bhajan Pura","line":{"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"name":"Bhajan Pura - Ghaziabad Purana Bus Adda","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":16},"travel_mode":"TRANSIT"},{"distance":{"text":"21.2 km","value":21186},"duration":{"text":"1 hour 12 mins","value":4345},"end_location":{"lat":28.703981,"lng":77.100926},"html_instructions":"Bus towards Q Block Mangolpuri Terminal","polyline":{"points":"k`enDgxrvMD?CfCa@~Hg@nOW|HOdDI|ASzIFX@h@?t@GpBGd@eAxFcA`GI`@Pf@DX@VCXGTMTKNWjCALYlFg@|KK|E@dC?lA@f@?h@?p@?|@Cf@GNa@Zi@b@w@`@_@La@BgAEa@Bm@Lg@XYTW\\Qb@qFzX}AvHm@|C_CrLiBpI]bAKPiAbGiEvTW~C?VH`@bAjAJR\\lAXvAB`@B`@FnANnAl@|BZhAWH}Bh@{ANk@@yBMiD]SIOGOEsABs@Dm@HmDn@kEjAyDpAm@`@}@bA}@|AgAxB{AdDYl@GLy@fBSb@]dAmCfKeCbKaAnDg@hBoFbSaH~W}D|NqA~Ee@dB_CpIqAlEa@rAIjAi@rC}@bGq@~E?j@@J?\\CLIPMLMh@I^{B|Mk@lBkBlMwCfSE|@g@jEoBpMoBjKa@hCu@hEoAfGu@fDy@hCWZ]rA_BlGUz@}GfWW|@u@nCAl@e@jCc@tAkAfFoArHSpB]lEOvD?lFAtEIt@Dp@XvBZpA|AzE`BpFbB`FtAfDpAbCnAdC`C~EfGzJpA|B^p@zAlCvDnGZT`CpDpBjDrCpFh@|@n@hAlAhBrBzC|AlBd@h@fAnAr@r@pAfAvAz@~A~@dDbBp@XlBh@pEjA|Bb@b@HlGx@dC^jGv@@Ir@J~Dd@nBX`ANrEt@vC~@tCr@zBv@jAn@zE~Cn@f@JLN^~CdCjFjEr@n@xBhBx@p@tBfB~FjEvB`BVTfBzA`Az@VVGJEHABQVkEpHs@lA}@jAu@nAu@jA{BzDg@x@}AdCmClEsClEc@t@{AbCgCbE}BpDeBvCaA|AyC~EmB|CyBhDKPyBlDeFnIgAfBgCdEe@t@SZO^?JfJ~HlGlFp@j@~CjC|BfBpAjA|ArAvHxGhA~@dCvBzMlL`ClB`DtClC`CBE"},"start_location":{"lat":28.702937,"lng":77.269965},"transit_details":{"arrival_stop":{"location":{"lat":28.703981,"lng":77.100926},"name":"Rohini Sector 1 Avantika"},"arrival_time":{"text":"8:45pm","time_zone":"Asia/Calcutta","value":1531322136},"departure_stop":{"location":{"lat":28.702937,"lng":77.269965},"name":"B Block Yamuna Vihar"},"departure_time":{"text":"7:33pm","time_zone":"Asia/Calcutta","value":1531317791},"headsign":"Q Block Mangolpuri Terminal","line":{"agencies":[{"name":"DIMTS","phone":"011 91 11 4309 0100","url":"http://businfo.dimts.in/businfo/"}],"short_name":"932A","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":34},"travel_mode":"TRANSIT"},{"distance":{"text":"0.2 km","value":227},"duration":{"text":"3 mins","value":169},"end_location":{"lat":28.704112,"lng":77.1024411},"html_instructions":"Walk to Delhi, India","polyline":{"points":"_genDswquMYYVa@RYb@s@FK\\k@BEq@i@A@EBABA?A?A?ECECEE?AA??A?A?A@CDIg@g@"},"start_location":{"lat":28.7039956,"lng":77.1009043},"steps":[{"distance":{"text":"19 m","value":19},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.7041343,"lng":77.1010252},"html_instructions":"Head <b>northeast<\/b> on <b>Sir Chotu Ram Marg<\/b>","polyline":{"points":"_genDswquMYY"},"start_location":{"lat":28.7039956,"lng":77.1009043},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":109},"duration":{"text":"1 min","value":85},"end_location":{"lat":28.7035249,"lng":77.1019008},"html_instructions":"Turn <b>right<\/b> at Shree Sudarshan Electronics","maneuver":"turn-right","polyline":{"points":"ygenDmxquMVa@RYb@s@FK\\k@BE"},"start_location":{"lat":28.7041343,"lng":77.1010252},"travel_mode":"WALKING"},{"distance":{"text":"34 m","value":34},"duration":{"text":"1 min","value":24},"end_location":{"lat":28.7037663,"lng":77.1021109},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"_denD{}quMq@i@"},"start_location":{"lat":28.7035249,"lng":77.1019008},"travel_mode":"WALKING"},{"distance":{"text":"35 m","value":35},"duration":{"text":"1 min","value":25},"end_location":{"lat":28.70391189999999,"lng":77.1022401},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"qeenDe_ruMA@EBABA?A?A?ECECEE?AA??A?A?A@CDI"},"start_location":{"lat":28.7037663,"lng":77.1021109},"travel_mode":"WALKING"},{"distance":{"text":"30 m","value":30},"duration":{"text":"1 min","value":21},"end_location":{"lat":28.704112,"lng":77.1024411},"html_instructions":"Turn <b>left<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-left","polyline":{"points":"mfenD_`ruMg@g@"},"start_location":{"lat":28.70391189999999,"lng":77.1022401},"travel_mode":"WALKING"}],"travel_mode":"WALKING"}],"traffic_speed_entry":[],"via_waypoint":[]}]
         * overview_polyline : {"points":"i~~mDclnwMH@Di@N{BE][w@_DqFcAaBC[Dw@Vw@l@i@|ADvAM\\Ep@W`DoB`@o@fC{Hp@_BnEcHbBsCj@oAbBoCl@q@~@m@dB}@_@o@gAkA{DkD}IaIo@eB}@yJsBmSDAQqBn@GPlBSBdCd[\\vCb@bAlGvFrI~Hr@`AFN}Az@}@n@w@t@mBzCm@~@KFe@v@eE~GsAvCeAlC}BfHg@jBcEdTe@tCyDxUcBnJa@vAyE~Ua@`DIrAiB|My@bFy@|Dg@jCu@dFcB|I_H|`@[rFQjTGh@_@v@wF|HmAjAcGhF{@t@}CxBuGdDiIzDgGpC_Bj@k@Xk@ZCHGH_@tJuCjcAGzCAhFTpCH`@HJ?b@QLM^C\\UvGy@`La@nCy@~DcA~CgMz[_AhC]jBw@zEwCpQ}AtIuCtPeBfKSjBiAdJOhByAxJ_AhGQn@y@~EwCtQcBhKA|BFjBLzBt@hGp@rDj@rB`@xBd@hFLrDE~B]vDgAzKe@bFoBjQW`Ec@bGuAjWe@tHu@`IiAjLu@~H{Cxg@GjBe@|Ig@lNObCgA~VyBni@]rMAxAE?D?CfCa@~Hg@nOW|HYbGSzIFX@~AOvCiCzNI`@Pf@Fp@Kn@Yd@YxCaAjSK|E@dC@tBC`EGNa@Zi@b@w@`@_@La@BgAEa@Bm@Lg@Xq@r@Qb@qFzXkCtMiFdWi@tAsGz\\WvDH`@bAjAh@`B\\xBJpBNnAl@|BZhAWH}Bh@{ANk@@yBMiD]SI_@MgCH{Ex@kEjAyDpAm@`@}@bAeCvEuBrEaAtBq@hBsGjWiBxGqObl@oG|UeDvLsB`HIjAi@rCoBbN@v@Cj@W^WhA{B|Mk@lBcGta@E|@g@jEoBpMoBjKwArIeCnLy@hCWZ}B`JaKp_@Al@e@jCc@tAkAfFoArHSpB]lEOvD?lFAtEIt@^hDZpA|AzEdErMtAfDpAbCpEdJxIxNzB~DvDnGZT`CpDpBjD|DnH|BrDrBzC|AlBlBxBdCzBvDzBvE|B~HtB`Dl@rKxAjGv@@IrFp@pDh@rEt@vC~@tCr@zBv@jAn@zE~Cz@t@N^~CdC~GzFrDzCtBfB~FjEnCvB`EnDa@p@_G~J}@jAu@nAqDfGeC~DaLtQmLjRmKxPoPjXy@pAO^?JtRlPpEvDnErDtKlJjTdR`ClB`DtClC`CBECDYYVa@v@mAd@w@BEq@i@GDGBQMAE@EDIg@g@"}
         * summary :
         * warnings : ["Walking directions are in beta.    Use caution \u2013 This route may be missing sidewalks or pedestrian paths."]
         * waypoint_order : []
         */

        private BoundsBean bounds;
        private String copyrights;
        private OverviewPolylineBean overview_polyline;
        private String summary;
        private List<LegsBean> legs;
        private List<String> warnings;
        private List<?> waypoint_order;

        public BoundsBean getBounds() {
            return bounds;
        }

        public void setBounds(BoundsBean bounds) {
            this.bounds = bounds;
        }

        public String getCopyrights() {
            return copyrights;
        }

        public void setCopyrights(String copyrights) {
            this.copyrights = copyrights;
        }

        public OverviewPolylineBean getOverview_polyline() {
            return overview_polyline;
        }

        public void setOverview_polyline(OverviewPolylineBean overview_polyline) {
            this.overview_polyline = overview_polyline;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<LegsBean> getLegs() {
            return legs;
        }

        public void setLegs(List<LegsBean> legs) {
            this.legs = legs;
        }

        public List<String> getWarnings() {
            return warnings;
        }

        public void setWarnings(List<String> warnings) {
            this.warnings = warnings;
        }

        public List<?> getWaypoint_order() {
            return waypoint_order;
        }

        public void setWaypoint_order(List<?> waypoint_order) {
            this.waypoint_order = waypoint_order;
        }

        public static class BoundsBean {
            /**
             * northeast : {"lat":28.73764,"lng":77.431783}
             * southwest : {"lat":28.66595999999999,"lng":77.10089900000001}
             */

            private NortheastBean northeast;
            private SouthwestBean southwest;

            public NortheastBean getNortheast() {
                return northeast;
            }

            public void setNortheast(NortheastBean northeast) {
                this.northeast = northeast;
            }

            public SouthwestBean getSouthwest() {
                return southwest;
            }

            public void setSouthwest(SouthwestBean southwest) {
                this.southwest = southwest;
            }

            public static class NortheastBean {
                /**
                 * lat : 28.73764
                 * lng : 77.431783
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class SouthwestBean {
                /**
                 * lat : 28.66595999999999
                 * lng : 77.10089900000001
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class OverviewPolylineBean {
            /**
             * points : i~~mDclnwMH@Di@N{BE][w@_DqFcAaBC[Dw@Vw@l@i@|ADvAM\Ep@W`DoB`@o@fC{Hp@_BnEcHbBsCj@oAbBoCl@q@~@m@dB}@_@o@gAkA{DkD}IaIo@eB}@yJsBmSDAQqBn@GPlBSBdCd[\vCb@bAlGvFrI~Hr@`AFN}Az@}@n@w@t@mBzCm@~@KFe@v@eE~GsAvCeAlC}BfHg@jBcEdTe@tCyDxUcBnJa@vAyE~Ua@`DIrAiB|My@bFy@|Dg@jCu@dFcB|I_H|`@[rFQjTGh@_@v@wF|HmAjAcGhF{@t@}CxBuGdDiIzDgGpC_Bj@k@Xk@ZCHGH_@tJuCjcAGzCAhFTpCH`@HJ?b@QLM^C\UvGy@`La@nCy@~DcA~CgMz[_AhC]jBw@zEwCpQ}AtIuCtPeBfKSjBiAdJOhByAxJ_AhGQn@y@~EwCtQcBhKA|BFjBLzBt@hGp@rDj@rB`@xBd@hFLrDE~B]vDgAzKe@bFoBjQW`Ec@bGuAjWe@tHu@`IiAjLu@~H{Cxg@GjBe@|Ig@lNObCgA~VyBni@]rMAxAE?D?CfCa@~Hg@nOW|HYbGSzIFX@~AOvCiCzNI`@Pf@Fp@Kn@Yd@YxCaAjSK|E@dC@tBC`EGNa@Zi@b@w@`@_@La@BgAEa@Bm@Lg@Xq@r@Qb@qFzXkCtMiFdWi@tAsGz\WvDH`@bAjAh@`B\xBJpBNnAl@|BZhAWH}Bh@{ANk@@yBMiD]SI_@MgCH{Ex@kEjAyDpAm@`@}@bAeCvEuBrEaAtBq@hBsGjWiBxGqObl@oG|UeDvLsB`HIjAi@rCoBbN@v@Cj@W^WhA{B|Mk@lBcGta@E|@g@jEoBpMoBjKwArIeCnLy@hCWZ}B`JaKp_@Al@e@jCc@tAkAfFoArHSpB]lEOvD?lFAtEIt@^hDZpA|AzEdErMtAfDpAbCpEdJxIxNzB~DvDnGZT`CpDpBjD|DnH|BrDrBzC|AlBlBxBdCzBvDzBvE|B~HtB`Dl@rKxAjGv@@IrFp@pDh@rEt@vC~@tCr@zBv@jAn@zE~Cz@t@N^~CdC~GzFrDzCtBfB~FjEnCvB`EnDa@p@_G~J}@jAu@nAqDfGeC~DaLtQmLjRmKxPoPjXy@pAO^?JtRlPpEvDnErDtKlJjTdR`ClB`DtClC`CBECDYYVa@v@mAd@w@BEq@i@GDGBQMAE@EDIg@g@
             */

            private String points;

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }
        }

        public static class LegsBean {
            /**
             * arrival_time : {"text":"8:48pm","time_zone":"Asia/Calcutta","value":1531322306}
             * departure_time : {"text":"6:13pm","time_zone":"Asia/Calcutta","value":1531313011}
             * distance : {"text":"41.2 km","value":41187}
             * duration : {"text":"2 hours 35 mins","value":9295}
             * end_address : Delhi, India
             * end_location : {"lat":28.704112,"lng":77.1024411}
             * start_address : Ghaziabad, Uttar Pradesh, India
             * start_location : {"lat":28.671886,"lng":77.411377}
             * steps : [{"distance":{"text":"2.5 km","value":2549},"duration":{"text":"7 mins","value":411},"end_location":{"lat":28.670478,"lng":77.431164},"html_instructions":"Bus towards Ghaziabad Purana Bus Adda","polyline":{"points":"i~~mDclnwMH@Di@N}A?]E][w@_AgB_BiCcAaBC[?SDc@H[L[VYTO|ADvAM\\Ep@W`DoB`@o@x@gClAsDp@_BnEcHbBsCj@oAj@cAv@kAl@q@~@m@dB}@_@o@gAkA{DkDmF{EoBeBQ]]gAUoBg@iGoBoSC@"},"start_location":{"lat":28.671886,"lng":77.411377},"transit_details":{"arrival_stop":{"location":{"lat":28.670478,"lng":77.431164},"name":"Ghaziabad Purana Bus Adda"},"arrival_time":{"text":"6:20pm","time_zone":"Asia/Calcutta","value":1531313422},"departure_stop":{"location":{"lat":28.671886,"lng":77.411377},"name":"Meerut More"},"departure_time":{"text":"6:13pm","time_zone":"Asia/Calcutta","value":1531313011},"headsign":"Ghaziabad Purana Bus Adda","line":{"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"name":"Bhajan Pura - Ghaziabad Purana Bus Adda","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":1},"travel_mode":"TRANSIT"},{"distance":{"text":"0.1 km","value":138},"duration":{"text":"2 mins","value":112},"end_location":{"lat":28.6702133,"lng":77.4312252},"html_instructions":"Walk to Ghaziabad Purana Bus Adda","polyline":{"points":"iu~mDygrwMQqBn@GPlB"},"start_location":{"lat":28.6704515,"lng":77.4311692},"steps":[{"distance":{"text":"56 m","value":56},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.6705376,"lng":77.4317363},"html_instructions":"Head <b>east<\/b> toward <b>Ambedkar Rd<\/b>/<b>Dr Shyam Prasad Mukh Marg<\/b>","polyline":{"points":"iu~mDygrwMQqB"},"start_location":{"lat":28.6704515,"lng":77.4311692},"travel_mode":"WALKING"},{"distance":{"text":"27 m","value":27},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.6702957,"lng":77.431783},"html_instructions":"Turn <b>right<\/b> at <b>Old Bus Stand Chowk<\/b> onto <b>Ambedkar Rd<\/b>/<b>Dr Shyam Prasad Mukh Marg<\/b>","maneuver":"turn-right","polyline":{"points":"{u~mDkkrwMn@G"},"start_location":{"lat":28.6705376,"lng":77.4317363},"travel_mode":"WALKING"},{"distance":{"text":"55 m","value":55},"duration":{"text":"1 min","value":45},"end_location":{"lat":28.6702133,"lng":77.4312252},"html_instructions":"Turn <b>right<\/b> at <b>Old Bus Stand Chowk<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-right","polyline":{"points":"kt~mDskrwMPlB"},"start_location":{"lat":28.6702957,"lng":77.431783},"travel_mode":"WALKING"}],"travel_mode":"WALKING"},{"distance":{"text":"17.1 km","value":17087},"duration":{"text":"58 mins","value":3474},"end_location":{"lat":28.702937,"lng":77.269965},"html_instructions":"Bus towards Bhajan Pura","polyline":{"points":"ct~mDchrwMI@rA~Op@dJLxAN|@b@bAlGvFjEzDfCbC\\`@T^FN}Az@}@n@w@t@i@v@cAbBWd@UXKFe@v@eE~GsAvCeAlC}BfHg@jBcEdTe@tCuBxMcA~FcBnJa@vAuAzGcCbMa@`DIrAu@rFs@hFy@bFy@|Dg@jCu@dFw@~Dk@|CqCdPmCvOQ|BItBKhLE`GGh@_@v@wF|HmAjAuE~Dm@h@{@t@oA`AkAt@A@iBbAkD`Bw@ZqG~CgGpC_Bj@OH[N_@RKFABADCDCBKhCSjF]`M}@~Yy@xY?N?@GxCAhFTpCD^B@DDBDBNCRKHEBM^C\\UvGy@`La@nCy@~D[jAg@rAqEfL_BdE_CbGUh@_AhC]jBq@hEEP}@tFyAzIe@rCw@`E_B|Iu@vEeBfKSjBiAdJOhBU|AcAzG_AhGQn@WdBa@xBYpBc@dCa@nCw@lEcAfG_@`CApA?j@BlAB\\LzBt@hGVzAXvAj@rB`@xBNjAT|CLrDE~BWlCEh@}@fJIr@c@zEAFoBjQW`E]|EEd@o@nKe@zJMrBW`E[rDYlCa@bEg@fFc@~DQ~BS|CaAzOi@nJ[nFGjBQhCSrEg@lNObCOdDw@xQOtEaAxTCb@c@zKMzDOvGAxAE?"},"start_location":{"lat":28.670256,"lng":77.43121699999999},"transit_details":{"arrival_stop":{"location":{"lat":28.702937,"lng":77.269965},"name":"B Block Yamuna Vihar"},"arrival_time":{"text":"7:27pm","time_zone":"Asia/Calcutta","value":1531317474},"departure_stop":{"location":{"lat":28.670256,"lng":77.43121699999999},"name":"Ghaziabad Purana Bus Adda"},"departure_time":{"text":"6:30pm","time_zone":"Asia/Calcutta","value":1531314000},"headsign":"Bhajan Pura","line":{"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"name":"Bhajan Pura - Ghaziabad Purana Bus Adda","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":16},"travel_mode":"TRANSIT"},{"distance":{"text":"21.2 km","value":21186},"duration":{"text":"1 hour 12 mins","value":4345},"end_location":{"lat":28.703981,"lng":77.100926},"html_instructions":"Bus towards Q Block Mangolpuri Terminal","polyline":{"points":"k`enDgxrvMD?CfCa@~Hg@nOW|HOdDI|ASzIFX@h@?t@GpBGd@eAxFcA`GI`@Pf@DX@VCXGTMTKNWjCALYlFg@|KK|E@dC?lA@f@?h@?p@?|@Cf@GNa@Zi@b@w@`@_@La@BgAEa@Bm@Lg@XYTW\\Qb@qFzX}AvHm@|C_CrLiBpI]bAKPiAbGiEvTW~C?VH`@bAjAJR\\lAXvAB`@B`@FnANnAl@|BZhAWH}Bh@{ANk@@yBMiD]SIOGOEsABs@Dm@HmDn@kEjAyDpAm@`@}@bA}@|AgAxB{AdDYl@GLy@fBSb@]dAmCfKeCbKaAnDg@hBoFbSaH~W}D|NqA~Ee@dB_CpIqAlEa@rAIjAi@rC}@bGq@~E?j@@J?\\CLIPMLMh@I^{B|Mk@lBkBlMwCfSE|@g@jEoBpMoBjKa@hCu@hEoAfGu@fDy@hCWZ]rA_BlGUz@}GfWW|@u@nCAl@e@jCc@tAkAfFoArHSpB]lEOvD?lFAtEIt@Dp@XvBZpA|AzE`BpFbB`FtAfDpAbCnAdC`C~EfGzJpA|B^p@zAlCvDnGZT`CpDpBjDrCpFh@|@n@hAlAhBrBzC|AlBd@h@fAnAr@r@pAfAvAz@~A~@dDbBp@XlBh@pEjA|Bb@b@HlGx@dC^jGv@@Ir@J~Dd@nBX`ANrEt@vC~@tCr@zBv@jAn@zE~Cn@f@JLN^~CdCjFjEr@n@xBhBx@p@tBfB~FjEvB`BVTfBzA`Az@VVGJEHABQVkEpHs@lA}@jAu@nAu@jA{BzDg@x@}AdCmClEsClEc@t@{AbCgCbE}BpDeBvCaA|AyC~EmB|CyBhDKPyBlDeFnIgAfBgCdEe@t@SZO^?JfJ~HlGlFp@j@~CjC|BfBpAjA|ArAvHxGhA~@dCvBzMlL`ClB`DtClC`CBE"},"start_location":{"lat":28.702937,"lng":77.269965},"transit_details":{"arrival_stop":{"location":{"lat":28.703981,"lng":77.100926},"name":"Rohini Sector 1 Avantika"},"arrival_time":{"text":"8:45pm","time_zone":"Asia/Calcutta","value":1531322136},"departure_stop":{"location":{"lat":28.702937,"lng":77.269965},"name":"B Block Yamuna Vihar"},"departure_time":{"text":"7:33pm","time_zone":"Asia/Calcutta","value":1531317791},"headsign":"Q Block Mangolpuri Terminal","line":{"agencies":[{"name":"DIMTS","phone":"011 91 11 4309 0100","url":"http://businfo.dimts.in/businfo/"}],"short_name":"932A","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":34},"travel_mode":"TRANSIT"},{"distance":{"text":"0.2 km","value":227},"duration":{"text":"3 mins","value":169},"end_location":{"lat":28.704112,"lng":77.1024411},"html_instructions":"Walk to Delhi, India","polyline":{"points":"_genDswquMYYVa@RYb@s@FK\\k@BEq@i@A@EBABA?A?A?ECECEE?AA??A?A?A@CDIg@g@"},"start_location":{"lat":28.7039956,"lng":77.1009043},"steps":[{"distance":{"text":"19 m","value":19},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.7041343,"lng":77.1010252},"html_instructions":"Head <b>northeast<\/b> on <b>Sir Chotu Ram Marg<\/b>","polyline":{"points":"_genDswquMYY"},"start_location":{"lat":28.7039956,"lng":77.1009043},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":109},"duration":{"text":"1 min","value":85},"end_location":{"lat":28.7035249,"lng":77.1019008},"html_instructions":"Turn <b>right<\/b> at Shree Sudarshan Electronics","maneuver":"turn-right","polyline":{"points":"ygenDmxquMVa@RYb@s@FK\\k@BE"},"start_location":{"lat":28.7041343,"lng":77.1010252},"travel_mode":"WALKING"},{"distance":{"text":"34 m","value":34},"duration":{"text":"1 min","value":24},"end_location":{"lat":28.7037663,"lng":77.1021109},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"_denD{}quMq@i@"},"start_location":{"lat":28.7035249,"lng":77.1019008},"travel_mode":"WALKING"},{"distance":{"text":"35 m","value":35},"duration":{"text":"1 min","value":25},"end_location":{"lat":28.70391189999999,"lng":77.1022401},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"qeenDe_ruMA@EBABA?A?A?ECECEE?AA??A?A?A@CDI"},"start_location":{"lat":28.7037663,"lng":77.1021109},"travel_mode":"WALKING"},{"distance":{"text":"30 m","value":30},"duration":{"text":"1 min","value":21},"end_location":{"lat":28.704112,"lng":77.1024411},"html_instructions":"Turn <b>left<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-left","polyline":{"points":"mfenD_`ruMg@g@"},"start_location":{"lat":28.70391189999999,"lng":77.1022401},"travel_mode":"WALKING"}],"travel_mode":"WALKING"}]
             * traffic_speed_entry : []
             * via_waypoint : []
             */

            private ArrivalTimeBean arrival_time;
            private DepartureTimeBean departure_time;
            private DistanceBean distance;
            private DurationBean duration;
            private String end_address;
            private EndLocationBean end_location;
            private String start_address;
            private StartLocationBean start_location;
            private List<StepsBeanX> steps;
            private List<?> traffic_speed_entry;
            private List<?> via_waypoint;

            public ArrivalTimeBean getArrival_time() {
                return arrival_time;
            }

            public void setArrival_time(ArrivalTimeBean arrival_time) {
                this.arrival_time = arrival_time;
            }

            public DepartureTimeBean getDeparture_time() {
                return departure_time;
            }

            public void setDeparture_time(DepartureTimeBean departure_time) {
                this.departure_time = departure_time;
            }

            public DistanceBean getDistance() {
                return distance;
            }

            public void setDistance(DistanceBean distance) {
                this.distance = distance;
            }

            public DurationBean getDuration() {
                return duration;
            }

            public void setDuration(DurationBean duration) {
                this.duration = duration;
            }

            public String getEnd_address() {
                return end_address;
            }

            public void setEnd_address(String end_address) {
                this.end_address = end_address;
            }

            public EndLocationBean getEnd_location() {
                return end_location;
            }

            public void setEnd_location(EndLocationBean end_location) {
                this.end_location = end_location;
            }

            public String getStart_address() {
                return start_address;
            }

            public void setStart_address(String start_address) {
                this.start_address = start_address;
            }

            public StartLocationBean getStart_location() {
                return start_location;
            }

            public void setStart_location(StartLocationBean start_location) {
                this.start_location = start_location;
            }

            public List<StepsBeanX> getSteps() {
                return steps;
            }

            public void setSteps(List<StepsBeanX> steps) {
                this.steps = steps;
            }

            public List<?> getTraffic_speed_entry() {
                return traffic_speed_entry;
            }

            public void setTraffic_speed_entry(List<?> traffic_speed_entry) {
                this.traffic_speed_entry = traffic_speed_entry;
            }

            public List<?> getVia_waypoint() {
                return via_waypoint;
            }

            public void setVia_waypoint(List<?> via_waypoint) {
                this.via_waypoint = via_waypoint;
            }

            public static class ArrivalTimeBean {
                /**
                 * text : 8:48pm
                 * time_zone : Asia/Calcutta
                 * value : 1531322306
                 */

                private String text;
                private String time_zone;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getTime_zone() {
                    return time_zone;
                }

                public void setTime_zone(String time_zone) {
                    this.time_zone = time_zone;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DepartureTimeBean {
                /**
                 * text : 6:13pm
                 * time_zone : Asia/Calcutta
                 * value : 1531313011
                 */

                private String text;
                private String time_zone;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getTime_zone() {
                    return time_zone;
                }

                public void setTime_zone(String time_zone) {
                    this.time_zone = time_zone;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DistanceBean {
                /**
                 * text : 41.2 km
                 * value : 41187
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DurationBean {
                /**
                 * text : 2 hours 35 mins
                 * value : 9295
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class EndLocationBean {
                /**
                 * lat : 28.704112
                 * lng : 77.1024411
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StartLocationBean {
                /**
                 * lat : 28.671886
                 * lng : 77.411377
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StepsBeanX {
                /**
                 * distance : {"text":"2.5 km","value":2549}
                 * duration : {"text":"7 mins","value":411}
                 * end_location : {"lat":28.670478,"lng":77.431164}
                 * html_instructions : Bus towards Ghaziabad Purana Bus Adda
                 * polyline : {"points":"i~~mDclnwMH@Di@N}A?]E][w@_AgB_BiCcAaBC[?SDc@H[L[VYTO|ADvAM\\Ep@W`DoB`@o@x@gClAsDp@_BnEcHbBsCj@oAj@cAv@kAl@q@~@m@dB}@_@o@gAkA{DkDmF{EoBeBQ]]gAUoBg@iGoBoSC@"}
                 * start_location : {"lat":28.671886,"lng":77.411377}
                 * transit_details : {"arrival_stop":{"location":{"lat":28.670478,"lng":77.431164},"name":"Ghaziabad Purana Bus Adda"},"arrival_time":{"text":"6:20pm","time_zone":"Asia/Calcutta","value":1531313422},"departure_stop":{"location":{"lat":28.671886,"lng":77.411377},"name":"Meerut More"},"departure_time":{"text":"6:13pm","time_zone":"Asia/Calcutta","value":1531313011},"headsign":"Ghaziabad Purana Bus Adda","line":{"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"name":"Bhajan Pura - Ghaziabad Purana Bus Adda","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":1}
                 * travel_mode : TRANSIT
                 * steps : [{"distance":{"text":"56 m","value":56},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.6705376,"lng":77.4317363},"html_instructions":"Head <b>east<\/b> toward <b>Ambedkar Rd<\/b>/<b>Dr Shyam Prasad Mukh Marg<\/b>","polyline":{"points":"iu~mDygrwMQqB"},"start_location":{"lat":28.6704515,"lng":77.4311692},"travel_mode":"WALKING"},{"distance":{"text":"27 m","value":27},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.6702957,"lng":77.431783},"html_instructions":"Turn <b>right<\/b> at <b>Old Bus Stand Chowk<\/b> onto <b>Ambedkar Rd<\/b>/<b>Dr Shyam Prasad Mukh Marg<\/b>","maneuver":"turn-right","polyline":{"points":"{u~mDkkrwMn@G"},"start_location":{"lat":28.6705376,"lng":77.4317363},"travel_mode":"WALKING"},{"distance":{"text":"55 m","value":55},"duration":{"text":"1 min","value":45},"end_location":{"lat":28.6702133,"lng":77.4312252},"html_instructions":"Turn <b>right<\/b> at <b>Old Bus Stand Chowk<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-right","polyline":{"points":"kt~mDskrwMPlB"},"start_location":{"lat":28.6702957,"lng":77.431783},"travel_mode":"WALKING"}]
                 */

                private DistanceBeanX distance;
                private DurationBeanX duration;
                private EndLocationBeanX end_location;
                private String html_instructions;
                private PolylineBean polyline;
                private StartLocationBeanX start_location;
                private TransitDetailsBean transit_details;
                private String travel_mode;
                private List<StepsBean> steps;

                public DistanceBeanX getDistance() {
                    return distance;
                }

                public void setDistance(DistanceBeanX distance) {
                    this.distance = distance;
                }

                public DurationBeanX getDuration() {
                    return duration;
                }

                public void setDuration(DurationBeanX duration) {
                    this.duration = duration;
                }

                public EndLocationBeanX getEnd_location() {
                    return end_location;
                }

                public void setEnd_location(EndLocationBeanX end_location) {
                    this.end_location = end_location;
                }

                public String getHtml_instructions() {
                    return html_instructions;
                }

                public void setHtml_instructions(String html_instructions) {
                    this.html_instructions = html_instructions;
                }

                public PolylineBean getPolyline() {
                    return polyline;
                }

                public void setPolyline(PolylineBean polyline) {
                    this.polyline = polyline;
                }

                public StartLocationBeanX getStart_location() {
                    return start_location;
                }

                public void setStart_location(StartLocationBeanX start_location) {
                    this.start_location = start_location;
                }

                public TransitDetailsBean getTransit_details() {
                    return transit_details;
                }

                public void setTransit_details(TransitDetailsBean transit_details) {
                    this.transit_details = transit_details;
                }

                public String getTravel_mode() {
                    return travel_mode;
                }

                public void setTravel_mode(String travel_mode) {
                    this.travel_mode = travel_mode;
                }

                public List<StepsBean> getSteps() {
                    return steps;
                }

                public void setSteps(List<StepsBean> steps) {
                    this.steps = steps;
                }

                public static class DistanceBeanX {
                    /**
                     * text : 2.5 km
                     * value : 2549
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class DurationBeanX {
                    /**
                     * text : 7 mins
                     * value : 411
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class EndLocationBeanX {
                    /**
                     * lat : 28.670478
                     * lng : 77.431164
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class PolylineBean {
                    /**
                     * points : i~~mDclnwMH@Di@N}A?]E][w@_AgB_BiCcAaBC[?SDc@H[L[VYTO|ADvAM\Ep@W`DoB`@o@x@gClAsDp@_BnEcHbBsCj@oAj@cAv@kAl@q@~@m@dB}@_@o@gAkA{DkDmF{EoBeBQ]]gAUoBg@iGoBoSC@
                     */

                    private String points;

                    public String getPoints() {
                        return points;
                    }

                    public void setPoints(String points) {
                        this.points = points;
                    }
                }

                public static class StartLocationBeanX {
                    /**
                     * lat : 28.671886
                     * lng : 77.411377
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class TransitDetailsBean {
                    /**
                     * arrival_stop : {"location":{"lat":28.670478,"lng":77.431164},"name":"Ghaziabad Purana Bus Adda"}
                     * arrival_time : {"text":"6:20pm","time_zone":"Asia/Calcutta","value":1531313422}
                     * departure_stop : {"location":{"lat":28.671886,"lng":77.411377},"name":"Meerut More"}
                     * departure_time : {"text":"6:13pm","time_zone":"Asia/Calcutta","value":1531313011}
                     * headsign : Ghaziabad Purana Bus Adda
                     * line : {"agencies":[{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}],"name":"Bhajan Pura - Ghaziabad Purana Bus Adda","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}}
                     * num_stops : 1
                     */

                    private ArrivalStopBean arrival_stop;
                    private ArrivalTimeBeanX arrival_time;
                    private DepartureStopBean departure_stop;
                    private DepartureTimeBeanX departure_time;
                    private String headsign;
                    private LineBean line;
                    private int num_stops;

                    public ArrivalStopBean getArrival_stop() {
                        return arrival_stop;
                    }

                    public void setArrival_stop(ArrivalStopBean arrival_stop) {
                        this.arrival_stop = arrival_stop;
                    }

                    public ArrivalTimeBeanX getArrival_time() {
                        return arrival_time;
                    }

                    public void setArrival_time(ArrivalTimeBeanX arrival_time) {
                        this.arrival_time = arrival_time;
                    }

                    public DepartureStopBean getDeparture_stop() {
                        return departure_stop;
                    }

                    public void setDeparture_stop(DepartureStopBean departure_stop) {
                        this.departure_stop = departure_stop;
                    }

                    public DepartureTimeBeanX getDeparture_time() {
                        return departure_time;
                    }

                    public void setDeparture_time(DepartureTimeBeanX departure_time) {
                        this.departure_time = departure_time;
                    }

                    public String getHeadsign() {
                        return headsign;
                    }

                    public void setHeadsign(String headsign) {
                        this.headsign = headsign;
                    }

                    public LineBean getLine() {
                        return line;
                    }

                    public void setLine(LineBean line) {
                        this.line = line;
                    }

                    public int getNum_stops() {
                        return num_stops;
                    }

                    public void setNum_stops(int num_stops) {
                        this.num_stops = num_stops;
                    }

                    public static class ArrivalStopBean {
                        /**
                         * location : {"lat":28.670478,"lng":77.431164}
                         * name : Ghaziabad Purana Bus Adda
                         */

                        private LocationBean location;
                        private String name;

                        public LocationBean getLocation() {
                            return location;
                        }

                        public void setLocation(LocationBean location) {
                            this.location = location;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public static class LocationBean {
                            /**
                             * lat : 28.670478
                             * lng : 77.431164
                             */

                            private double lat;
                            private double lng;

                            public double getLat() {
                                return lat;
                            }

                            public void setLat(double lat) {
                                this.lat = lat;
                            }

                            public double getLng() {
                                return lng;
                            }

                            public void setLng(double lng) {
                                this.lng = lng;
                            }
                        }
                    }

                    public static class ArrivalTimeBeanX {
                        /**
                         * text : 6:20pm
                         * time_zone : Asia/Calcutta
                         * value : 1531313422
                         */

                        private String text;
                        private String time_zone;
                        private int value;

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public String getTime_zone() {
                            return time_zone;
                        }

                        public void setTime_zone(String time_zone) {
                            this.time_zone = time_zone;
                        }

                        public int getValue() {
                            return value;
                        }

                        public void setValue(int value) {
                            this.value = value;
                        }
                    }

                    public static class DepartureStopBean {
                        /**
                         * location : {"lat":28.671886,"lng":77.411377}
                         * name : Meerut More
                         */

                        private LocationBeanX location;
                        private String name;

                        public LocationBeanX getLocation() {
                            return location;
                        }

                        public void setLocation(LocationBeanX location) {
                            this.location = location;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public static class LocationBeanX {
                            /**
                             * lat : 28.671886
                             * lng : 77.411377
                             */

                            private double lat;
                            private double lng;

                            public double getLat() {
                                return lat;
                            }

                            public void setLat(double lat) {
                                this.lat = lat;
                            }

                            public double getLng() {
                                return lng;
                            }

                            public void setLng(double lng) {
                                this.lng = lng;
                            }
                        }
                    }

                    public static class DepartureTimeBeanX {
                        /**
                         * text : 6:13pm
                         * time_zone : Asia/Calcutta
                         * value : 1531313011
                         */

                        private String text;
                        private String time_zone;
                        private int value;

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public String getTime_zone() {
                            return time_zone;
                        }

                        public void setTime_zone(String time_zone) {
                            this.time_zone = time_zone;
                        }

                        public int getValue() {
                            return value;
                        }

                        public void setValue(int value) {
                            this.value = value;
                        }
                    }

                    public static class LineBean {
                        /**
                         * agencies : [{"name":"DTC","phone":"011 91 11 4140 0400","url":"http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home"}]
                         * name : Bhajan Pura - Ghaziabad Purana Bus Adda
                         * vehicle : {"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}
                         */

                        private String name;
                        private VehicleBean vehicle;
                        private List<AgenciesBean> agencies;

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public VehicleBean getVehicle() {
                            return vehicle;
                        }

                        public void setVehicle(VehicleBean vehicle) {
                            this.vehicle = vehicle;
                        }

                        public List<AgenciesBean> getAgencies() {
                            return agencies;
                        }

                        public void setAgencies(List<AgenciesBean> agencies) {
                            this.agencies = agencies;
                        }

                        public static class VehicleBean {
                            /**
                             * icon : //maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png
                             * name : Bus
                             * type : BUS
                             */

                            private String icon;
                            private String name;
                            private String type;

                            public String getIcon() {
                                return icon;
                            }

                            public void setIcon(String icon) {
                                this.icon = icon;
                            }

                            public String getName() {
                                return name;
                            }

                            public void setName(String name) {
                                this.name = name;
                            }

                            public String getType() {
                                return type;
                            }

                            public void setType(String type) {
                                this.type = type;
                            }
                        }

                        public static class AgenciesBean {
                            /**
                             * name : DTC
                             * phone : 011 91 11 4140 0400
                             * url : http://www.delhi.gov.in/wps/wcm/connect/doit_dtc/DTC/Home
                             */

                            private String name;
                            private String phone;
                            private String url;

                            public String getName() {
                                return name;
                            }

                            public void setName(String name) {
                                this.name = name;
                            }

                            public String getPhone() {
                                return phone;
                            }

                            public void setPhone(String phone) {
                                this.phone = phone;
                            }

                            public String getUrl() {
                                return url;
                            }

                            public void setUrl(String url) {
                                this.url = url;
                            }
                        }
                    }
                }

                public static class StepsBean {
                    /**
                     * distance : {"text":"56 m","value":56}
                     * duration : {"text":"1 min","value":40}
                     * end_location : {"lat":28.6705376,"lng":77.4317363}
                     * html_instructions : Head <b>east</b> toward <b>Ambedkar Rd</b>/<b>Dr Shyam Prasad Mukh Marg</b>
                     * polyline : {"points":"iu~mDygrwMQqB"}
                     * start_location : {"lat":28.6704515,"lng":77.4311692}
                     * travel_mode : WALKING
                     * maneuver : turn-right
                     */

                    private DistanceBeanXX distance;
                    private DurationBeanXX duration;
                    private EndLocationBeanXX end_location;
                    private String html_instructions;
                    private PolylineBeanX polyline;
                    private StartLocationBeanXX start_location;
                    private String travel_mode;
                    private String maneuver;

                    public DistanceBeanXX getDistance() {
                        return distance;
                    }

                    public void setDistance(DistanceBeanXX distance) {
                        this.distance = distance;
                    }

                    public DurationBeanXX getDuration() {
                        return duration;
                    }

                    public void setDuration(DurationBeanXX duration) {
                        this.duration = duration;
                    }

                    public EndLocationBeanXX getEnd_location() {
                        return end_location;
                    }

                    public void setEnd_location(EndLocationBeanXX end_location) {
                        this.end_location = end_location;
                    }

                    public String getHtml_instructions() {
                        return html_instructions;
                    }

                    public void setHtml_instructions(String html_instructions) {
                        this.html_instructions = html_instructions;
                    }

                    public PolylineBeanX getPolyline() {
                        return polyline;
                    }

                    public void setPolyline(PolylineBeanX polyline) {
                        this.polyline = polyline;
                    }

                    public StartLocationBeanXX getStart_location() {
                        return start_location;
                    }

                    public void setStart_location(StartLocationBeanXX start_location) {
                        this.start_location = start_location;
                    }

                    public String getTravel_mode() {
                        return travel_mode;
                    }

                    public void setTravel_mode(String travel_mode) {
                        this.travel_mode = travel_mode;
                    }

                    public String getManeuver() {
                        return maneuver;
                    }

                    public void setManeuver(String maneuver) {
                        this.maneuver = maneuver;
                    }

                    public static class DistanceBeanXX {
                        /**
                         * text : 56 m
                         * value : 56
                         */

                        private String text;
                        private int value;

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public int getValue() {
                            return value;
                        }

                        public void setValue(int value) {
                            this.value = value;
                        }
                    }

                    public static class DurationBeanXX {
                        /**
                         * text : 1 min
                         * value : 40
                         */

                        private String text;
                        private int value;

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public int getValue() {
                            return value;
                        }

                        public void setValue(int value) {
                            this.value = value;
                        }
                    }

                    public static class EndLocationBeanXX {
                        /**
                         * lat : 28.6705376
                         * lng : 77.4317363
                         */

                        private double lat;
                        private double lng;

                        public double getLat() {
                            return lat;
                        }

                        public void setLat(double lat) {
                            this.lat = lat;
                        }

                        public double getLng() {
                            return lng;
                        }

                        public void setLng(double lng) {
                            this.lng = lng;
                        }
                    }

                    public static class PolylineBeanX {
                        /**
                         * points : iu~mDygrwMQqB
                         */

                        private String points;

                        public String getPoints() {
                            return points;
                        }

                        public void setPoints(String points) {
                            this.points = points;
                        }
                    }

                    public static class StartLocationBeanXX {
                        /**
                         * lat : 28.6704515
                         * lng : 77.4311692
                         */

                        private double lat;
                        private double lng;

                        public double getLat() {
                            return lat;
                        }

                        public void setLat(double lat) {
                            this.lat = lat;
                        }

                        public double getLng() {
                            return lng;
                        }

                        public void setLng(double lng) {
                            this.lng = lng;
                        }
                    }
                }
            }
        }
    }
}
