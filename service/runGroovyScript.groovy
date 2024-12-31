def groovy_training = ec.entity.makeValue("MoquiTraining")
groovy_training.setFields(context, true, null, null)
groovy_training.setSequencedIdPrimary()
groovy_training.create()
context.trainingId = groovy_training.trainingId