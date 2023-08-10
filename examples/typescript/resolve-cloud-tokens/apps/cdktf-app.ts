import * as cdktf from 'cdktf';
import { CDKTFStack } from '../constructs/cdktf-stack';

export const cdktfApp = new cdktf.App({ outdir: 'cdktf.out' });
export const cdktfStack = new CDKTFStack(cdktfApp, 'aws');

