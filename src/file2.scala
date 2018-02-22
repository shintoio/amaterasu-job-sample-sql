val highNoDf = AmaContext.getDataFrame("step2", "under_800").where("number > 100")
highNoDf.write.mode(SaveMode.Overwrite).json(s"${env.outputRootPath}/dtatframe_res")
